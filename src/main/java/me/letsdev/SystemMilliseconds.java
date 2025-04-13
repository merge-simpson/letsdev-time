package me.letsdev;

public class SystemMilliseconds implements MillisecondSupplier {
    @Override
    public long getAsLong() {
        return System.currentTimeMillis();
    }
}
