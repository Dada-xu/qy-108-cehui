package com.aaa.xj.base;

import static com.aaa.xj.status.CrudStatus.*;
import static com.aaa.xj.status.CrudStatus.DELETE_SUCCESS;
import static com.aaa.xj.status.CrudStatus.UPDATE_FAILED;
import static com.aaa.xj.status.CrudStatus.UPDATE_SUCCESS;
import static com.aaa.xj.status.LoginStatus.*;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/12 16:49
 * @Description
 *      通用controller，就是实现consumer和provider统一返回值
 **/
public class BaseController {

    /**
     * @author Seven Lee
     * @description
     *      登录成功，使用系统消息
     * @param []
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginSuccess() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * @author Seven Lee
     * @description
     *      登录成功，使用自定义消息
     * @param [msg]
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginSuccess(String msg) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author Seven Lee
     * @description
     *      登录成功，使用系统消息，自定义返回值
     * @param [data]
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginSuccess(Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     * @author Seven Lee
     * @description
     *      登录成功，自定义消息，自定义返回值
     * @param [msg, data]
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginSuccess(String msg, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }

    /**
     * @author Seven Lee
     * @description
     *      登录失败，使用系统消息
     * @param
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginFailed() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        return resultData;
    }
/**
   * @Author xj
   * @Description 删除成功
   * @Date 9:58 2020/5/13
   * @Param * @param
   * @return com.aaa.lee.base.ResultData
 */
    protected ResultData deleteSuccess() {
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_SUCCESS.getCode());
        resultData.setMsg(DELETE_SUCCESS.getMsg());
        return resultData;
    }
    /**
       * @Author xj
       * @Description 删除失败
       * @Date 10:12 2020/5/13
       * @Param * @param
       * @return com.aaa.lee.base.ResultData
     */
    protected ResultData deleteFalse() {
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_FAILED.getCode());
        resultData.setMsg(DELETE_FAILED.getMsg());
        return resultData;
    }
    /**
       * @Author xj
       * @Description 更新失败
       * @Date 10:28 2020/5/13
       * @Param * @param
       * @return com.aaa.lee.base.ResultData
     */
    protected ResultData updateSuccess() {
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_SUCCESS.getCode());
        resultData.setMsg(UPDATE_SUCCESS.getMsg());
        return resultData;
    }
    /**
       * @Author xj
       * @Description 更新失败
       * @Date 10:28 2020/5/13
       * @Param * @param
       * @return com.aaa.lee.base.ResultData
     */
    protected ResultData updateFalse() {
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_FAILED.getCode());
        resultData.setMsg(UPDATE_FAILED.getMsg());
        return resultData;
    }
    /**
       * @Author xj
       * @Description 查询成功，使用系统消息，自定义返回值
       * @Date 10:37 2020/5/13
       * @Param * @param
       * @return com.aaa.lee.base.ResultData
     */
    protected ResultData getSuccess(Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(QUERY_SUCCESS.getCode());
        resultData.setMsg(QUERY_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }
    /**
       * @Author xj
       * @Description 查询失败
       * @Date 10:37 2020/5/13
       * @Param * @param
       * @return com.aaa.lee.base.ResultData
     */
    protected ResultData getFalse() {
        ResultData resultData = new ResultData();
        resultData.setCode(QUERY_FALSE.getCode());
        resultData.setMsg(QUERY_FALSE.getMsg());
        return resultData;
    }

    /**
     * @Summary:
     * @Author:  xj
     * @description
     *       新增成功
     * @Data: 2020/5/13
     * @param
     * @Return:com.aaa.xj.base.ResultData
     */
    protected ResultData addSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(ADD_SUCCESS.getCode());
        resultData.setMsg(ADD_SUCCESS.getMsg());
        return resultData;
    }
    /**
     * @Summary:
     * @Author:  xj
     * @description
     *      新增失败
     * @Data: 2020/5/13
     * @param
     * @Return:com.aaa.xj.base.ResultData
     */
    protected ResultData addFalse(){
        ResultData resultData = new ResultData();
        resultData.setCode(ADD_FAILED.getCode());
        resultData.setMsg(ADD_FAILED.getMsg());
        return resultData;
    }

    /**
     * @Summary:
     * @Author:  xj
     * @description
     *      文件上传成功
     * @Data: 2020/5/30
     * @param []
     * @Return:com.aaa.xj.base.ResultData
     */
    protected ResultData uploadSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(UPLOAD_SUCCESS.getCode());
        resultData.setMsg(UPLOAD_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * @Summary:
     * @Author:  xj
     * @description
     *      文件上传失败
     * @Data: 2020/5/30
     * @param []
     * @Return:com.aaa.xj.base.ResultData
     */
    protected ResultData uploadFalse(){
        ResultData resultData = new ResultData();
        resultData.setCode(UPLOAD_FAILED.getCode());
        resultData.setCode(UPLOAD_FAILED.getMsg());
        return resultData;
    }


}
