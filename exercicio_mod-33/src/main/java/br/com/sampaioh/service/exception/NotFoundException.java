package br.com.sampaioh.service.exception;

public class NotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public NotFoundException() {super("Not found.");}
}
