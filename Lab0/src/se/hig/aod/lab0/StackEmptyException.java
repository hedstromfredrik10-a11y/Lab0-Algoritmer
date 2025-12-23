package se.hig.aod.lab0;

class StackEmptyException extends RuntimeException {
    /**
     * A constructor that takes a message about which error has been generated.
     * This can be written to the user when the exception is caught.
     */
    public StackEmptyException(String m) {
        super(m);
    }

}
