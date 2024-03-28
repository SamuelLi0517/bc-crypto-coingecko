package com.venturenix.demospringbootexercise2.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  // @ExceptionHandler(JPHClientException.class) // catch
  // @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
  // public ApiResp<Void> jphClientExceptionHandler(JPHClientException e) {
  //   return ApiResponse.<Void>builder() //
  //       .code(e.getCode()) //
  //       .message(e.getMessage()) //
  //       .data(null) //
  //       .build();
  // }

  // @ExceptionHandler(ResourceNotFound.class)
  // @ResponseStatus(value = HttpStatus.OK)
  // public ApiResp<Void> npeExceptionHandler(ResourceNotFound e) {
  //   return ApiResponse.<Void>builder() //
  //       .code(Code.NOTFOUND.getCode()) //
  //       .message(Code.NOTFOUND.getMessage()) //
  //       .data(null) //
  //       .build();
  // }
  // @ExceptionHandler(InvalidCoinException.class)
  // @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  // public ApiResp<Void> InvalidCoinExceptionHandler(
  //     InvalidCoinException ex) {
  //   return ApiResponse.<Void>builder() //
  //       .code(Code.INVALID_COIN.getCode()) //
  //       .message(Code.INVALID_COIN.getMessage()) //
  //       .data(null) //
  //       .build();
  // }

  // @ExceptionHandler(InvalidCurrencyException.class)
  // @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  // public ApiResp<Void> InvalidCurrencyExceptionHandler(
  //     InvalidCurrencyException ex) {
  //   return ApiResponse.<Void>builder() //
  //       .code(Code.INVALID_CURRENCY.getCode()) //
  //       .message(Code.INVALID_CURRENCY.getMessage()) //
  //       .data(null) //
  //       .build();
  // }


  // @ExceptionHandler(NullPointerException.class)
  // @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
  // public ApiResp<Void> npeExceptionHandler(NullPointerException e) {
  //   return ApiResponse.<Void>builder() //
  //       .code(Code.NPE_EXCEPTION.getCode()) //
  //       .message(Code.NPE_EXCEPTION.getMessage()) //
  //       .data(null) //
  //       .build();
  // }

  // @ExceptionHandler(Exception.class)
  // @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
  // public ApiResp<Void> npeExceptionHandler(Exception e) {
  //   return ApiResponse.<Void>builder() //
  //       .code(Code.GENERAL_EXCEPTION.getCode()) //
  //       .message(Code.GENERAL_EXCEPTION.getMessage()) //
  //       .data(null) //
  //       .build();
  // }
}
