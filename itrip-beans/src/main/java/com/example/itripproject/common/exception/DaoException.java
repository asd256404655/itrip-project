package com.example.itripproject.common.exception;

import com.example.itripproject.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program:itrip-project
 * @description:
 * @author:hhn
 * @create:2020-11-09 14:54
 **/
@Data
@ApiModel(value = "自定义Dao层异常")
public class DaoException extends RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;
    public DaoException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public DaoException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }

}
