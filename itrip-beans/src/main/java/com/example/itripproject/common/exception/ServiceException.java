package com.example.itripproject.common.exception;

import com.example.itripproject.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program:itrip-project
 * @description:
 * @author:hhn
 * @create:2020-11-09 14:56
 **/
@Data
@ApiModel(value = "自定义service层异常")
public class ServiceException extends RuntimeException {

    @ApiModelProperty(value = "异常状态码")
    private String errorCode;

    public ServiceException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public ServiceException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }

}
