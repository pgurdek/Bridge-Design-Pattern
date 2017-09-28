package com.bridge.movieExample;

import java.util.List;

abstract public class Printer {


    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();
}
