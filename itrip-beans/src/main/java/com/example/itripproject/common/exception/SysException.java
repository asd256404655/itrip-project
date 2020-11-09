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
@ApiModel(value = "自定义系统异常")
public class SysException extends RuntimeException {
    @ApiModelProperty(value = "异常编码")
    private String errorCode;

    public SysException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public SysException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }

}
