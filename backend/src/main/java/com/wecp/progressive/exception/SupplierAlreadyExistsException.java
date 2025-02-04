package com.wecp.progressive.exception;

<<<<<<< HEAD
public class SupplierAlreadyExistsException {
=======
public class SupplierAlreadyExistsException extends RuntimeException {
    public SupplierAlreadyExistsException(String message) {
        super(message);
    }
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}