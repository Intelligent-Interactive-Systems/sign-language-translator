package furhatos.app.videoskill.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*
import furhatos.app.videoskill.nlu.*
import furhatos.gestures.Gestures

val Start : State = state(Greetings) {

    onEntry {
        furhat.ask("Hi, are you here for the sign language detection?")
    }

    onResponse<Yes>{
        furhat.say("Welcome")
        furhat .gesture(Gestures.Smile( duration= 2.0 , strength = 1.0 ))
        goto( HandGesture )
    }

}


val HandGesture = state(Greetings) {
    onEntry {
        furhat.ask( "What kind of gestures do you want to show?" )
    }

    onResponse<RegisterGestureA> {
        furhat.say("This is A")
        furhat.ask("Which other gesture do you want to show?")
    }

    onResponse<RegisterGestureB> {
        furhat.say("This is B")
        furhat.ask("Which other gesture do you want to show?")
    }

    onResponse<RegisterGestureC> {
        furhat.say("This is C")
        furhat.ask("Which other gesture do you want to show?")
    }

    onResponse<RegisterGestureD> {
        furhat.say("This is D")
        furhat.ask("Which other gesture do you want to show?")
    }

    onResponse<RegisterGestureE> {
        furhat.say("This is E")
        furhat.ask("Which other gesture do you want to show?")
    }

    onResponse<RegisterGestureF> {
        furhat.say("This is F")
        furhat.ask("Which other gesture do you want to show?")
    }
}



