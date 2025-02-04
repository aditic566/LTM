package com.wecp.progressive.exception;

<<<<<<< HEAD
public class SupplierDoesNotExistException {
=======
public class SupplierDoesNotExistException extends RuntimeException {
    public SupplierDoesNotExistException(String message) {
        super(message);
    }
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}