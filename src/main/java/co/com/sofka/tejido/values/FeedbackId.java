package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;


public class FeedbackId extends Identity {

    private FeedbackId(String value) {
        super(value);
    }

    public FeedbackId(){}

    public static FeedbackId of(String value) {
        return new FeedbackId(value);
    }

}
