package br.com.leno.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    @Serial
    private static final long serialVersionUID= 1L;

    private Date timeStamp;
    private String menssage;
    private String detail;

    public ExceptionResponse(Date timeStamp, String menssage, String detail) {
        this.timeStamp = timeStamp;
        this.menssage = menssage;
        this.detail = detail;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getMenssage() {
        return menssage;
    }

    public String getDetail() {
        return detail;
    }


}
