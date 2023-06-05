import java.util.*

class Words {
    private var dictionary: MutableMap<String, MutableMap<String, String>>
    fun getDictionary(): Map<String, MutableMap<String, String>> { // получить
        return dictionary
    }

    fun setDictionary(dictionary: MutableMap<String, MutableMap<String, String>>) { //записать
        this.dictionary = dictionary
    }

    fun printAll() {
        for (key in dictionary.keys) {
            println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
            println("Dictionary = $key ( 1 ) ")
            //            System.out.println(dictionary.get(key));
            for (subKey in dictionary[key]!!.keys) {
                println(subKey + " - " + dictionary[key]!![subKey])
            }
        }
    }

    fun add(word: String, translate: String): Boolean {
        val codes = autochek(word)
        return if (codes == Codes.RU || codes == Codes.EN) {
//            Map<String,String> map = new TreeMap<>();
            if (!dictionary.containsKey(codes.toString())) {
                dictionary[codes.toString()] = TreeMap()
            }
            dictionary[codes.toString()]!![word] = translate
            true
        } else {
            false
        }
    }

    fun autochek(word: String): Codes {
        var isRu: Boolean
        var isEn: Boolean
        isEn = false
        isRu = isEn
        for (c in word.toCharArray()) {
            if (Character.UnicodeBlock.of(c) === Character.UnicodeBlock.CYRILLIC) {
                isRu = true
            } else if (Character.isLetter(c)) {
                isEn = true
            }
        }
        return if (isRu && !isEn) {
            Codes.RU
        } else if (!isRu && isEn) {
            Codes.EN
        } else {
            Codes.ALL
        }
    }

    init {
        dictionary = TreeMap()
        //        Map<String,String> dic = new TreeMap<>();
//        dic.put("птица","bird");
//        Map<String,String>dic2 = new TreeMap<>();
//        dic2.put("bird","птица");
//
//        dictionary.put("ru",dic2);
//        dictionary.put("en",dic);
//
//        String word = "en";
    } //    public  int hashCode(){
    //        return Objects.hash();
    //    }
}
