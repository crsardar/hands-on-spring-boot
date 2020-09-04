package com.crsardar.java.spring.boot.rest.internationalization;

import java.util.Locale;
import java.util.Objects;

public class InternationalizedMsg {

    private String message;
    private Locale locale;

    public InternationalizedMsg() {

    }

    public InternationalizedMsg(String message, Locale locale) {

        this.message = message;
        this.locale = locale;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof InternationalizedMsg))
            return false;

        InternationalizedMsg that = (InternationalizedMsg) o;
        return Objects.equals(getMessage(), that.getMessage()) &&
                Objects.equals(getLocale(), that.getLocale());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getMessage(), getLocale());
    }

    @Override
    public String toString() {

        return "InternationalizedMsg{" +
                "message='" + message + '\'' +
                ", locale=" + locale +
                '}';
    }
}
