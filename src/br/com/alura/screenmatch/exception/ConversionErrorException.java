package br.com.alura.screenmatch.exception;

public class ConversionErrorException extends RuntimeException {
    private String msg;
    public ConversionErrorException(String msg) {
        this.msg = msg;
    }
    @Override
    public String getMessage() {
        return this.getMessage();
    }
    //    public String getMsg(){
//        return this.msg;
//    }
}
