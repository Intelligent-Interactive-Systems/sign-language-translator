package furhatos.app.videoskill.nlu

import furhatos.nlu.ComplexEnumEntity
import furhatos.nlu.EnumEntity
import furhatos.nlu.Intent
import furhatos.nlu.ListEntity
import furhatos.nlu.common.Number
import furhatos.util.Language


class GestureListA : EnumEntity( stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf ( "one fingers" , "one finger")
    }
}

class RegisterGestureA(val ges: GestureListA? = null): Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("@ges", "These are @ges", "i have @ges", "there are @ges")
    }
}

class GestureListB : EnumEntity( stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf ( "two fingers" , "two finger")
    }
}

class RegisterGestureB(val ges: GestureListB? = null): Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("@ges", "These are @ges", "i have @ges", "there are @ges")
    }
}

class GestureListC : EnumEntity( stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf ( "three fingers" , "three finger")
    }
}

class RegisterGestureC(val ges: GestureListC? = null): Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("@ges", "These are @ges", "i have @ges", "there are @ges")
    }
}

class GestureListD : EnumEntity( stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf ( "four fingers" , "four finger")
    }
}

class RegisterGestureD(val ges: GestureListD? = null): Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("@ges", "These are @ges", "i have @ges", "there are @ges")
    }
}

class GestureListE : EnumEntity( stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf ( "five fingers" , "five finger")
    }
}

class RegisterGestureE(val ges: GestureListE? = null): Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("@ges", "These are @ges", "i have @ges", "there are @ges")
    }
}

class GestureListF : EnumEntity( stemming = true, speechRecPhrases = true){
    override fun getEnum(lang: Language): List<String> {
        return listOf ( "six fingers" , "six finger")
    }
}

class RegisterGestureF(val ges: GestureListE? = null): Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("@ges", "These are @ges", "i have @ges", "there are @ges")
    }
}
