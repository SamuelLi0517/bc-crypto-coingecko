package com.venturenix.demospringbootexercise2.infra;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.venturenix.demospringbootexercise2.exception.Code;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
// @Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResp<T> {

  private String code;

  private String message;

  private T Tdata;

  public ApiResp(ApiResponseBuilder<T> builder) {
    this.code = builder.code;
    this.message = builder.message;
    this.Tdata = builder.Tdata;
  }

  public String getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }

  public T getTData() {
    return this.Tdata;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setData(T data) {
    this.Tdata = data;
  }

  public static <T> ApiResponseBuilder<T> builder() { // user self-define T
    return new ApiResponseBuilder<>();
  }

  // builder
  public static class ApiResponseBuilder<T> {

    private String code;
    private String message;
    private T Tdata;

    public ApiResponseBuilder<T> code() { // instance method
      this.code = Code.OK.getCode();
     // this.message = Code.OK.getMessage();
      return this;
    }

    public ApiResponseBuilder<T> message(Code code) { // instance method
 //     this.code = code.getCode();
      this.message = code.getMessage();
      return this;
    }

    public ApiResponseBuilder<T> Tdata(T data) { // instance method
      this.Tdata = data;
      return this;
    }

    public ApiResp<T> build() { // instance method -> this
      return new ApiResp<>(this);
    }
  }
}
