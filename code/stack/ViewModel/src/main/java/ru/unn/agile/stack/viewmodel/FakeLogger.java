package ru.unn.agile.stack.viewmodel;

import java.util.ArrayList;
import java.util.List;

public class FakeLogger implements ILogger {
    private List<String> log = new ArrayList<String>();

    @Override
    public void log(final String logMessage) {
        log.add(logMessage);
    }

    @Override
    public List<String> getLog() {
        return log;
    }
}
