package com.hz;


public class BooleanAdapter {
    private boolean _answers;
    public String[] _BooleanAdapter = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};


public boolean ConvertTextToBoolean(String answer){
    for (String s : _BooleanAdapter) {
        if (answer.equals(s)) {
            _answers = true;
            break;
        }
    }
    return _answers;
}
}
