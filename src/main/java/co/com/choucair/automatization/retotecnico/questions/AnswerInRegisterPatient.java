package co.com.choucair.automatization.retotecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnswerInRegisterPatient implements Question<Boolean> {
    String message_save;


    public AnswerInRegisterPatient(String message) {

        this.message_save = message;
    }

    public static AnswerInRegisterPatient withTextSave(String message){

        return new AnswerInRegisterPatient(message);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String text_save = "Datos guardados correctamente.";

        if(text_save.equals(message_save)){
            result = true;
        }else{
            result = false;

        }
        return result;
    }


}
