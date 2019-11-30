package org.regexandserial.models.services;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class RegexExercise {

    public boolean isProperName(String name){
        //todo implements
        Pattern pattern = Pattern.compile("[A-Za-z]{6,}");
        return pattern.matcher(name).matches();
    }

    public boolean isProperSurname(String name){
        //todo implements
        Pattern pattern = Pattern.compile("[A-Za-z]{6,}");
        return pattern.matcher(name).matches();
    }

    public boolean isEmailAddress(String potentialEmail){
        //todo implements
        Pattern pattern = Pattern.compile("[A-Za-z]{6,}");
        return pattern.matcher(potentialEmail).matches();
    }

    public boolean isStreetCorrected(String potentialStreet){
        //todo implements
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{6,}");
        return pattern.matcher(potentialStreet).matches();
    }

    public boolean isPasswordSecure(String potentialPassword){
        Pattern pattern = Pattern.compile("[A-Za-z0-9][A-Za-z0-9,@]");
        return pattern.matcher(potentialPassword).matches();
    }

}
