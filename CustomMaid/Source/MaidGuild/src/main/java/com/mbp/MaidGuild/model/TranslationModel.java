package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
public class TranslationModel {

    public static class TranslationJson {
        //状态码
        String errNum;
        //状态信息
        String errMsg;
        //返回结果
        RetData retData;

        public String getErrNum() {
            return errNum;
        }

        public void setErrNum(String errNum) {
            this.errNum = errNum;
        }

        public String getErrMsg() {
            return errMsg;
        }

        public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }

        public RetData getRetData() {
            return retData;
        }

        public void setRetData(RetData retData) {
            this.retData = retData;
        }
    }


    public static class RetData {
        //源语言
        String from;
        //目标语言
        String to;
        //翻译结果
        Trans_result[] trans_result;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public Trans_result[] getTrans_result() {
            return trans_result;
        }

        public void setTrans_result(Trans_result[] trans_result) {
            this.trans_result = trans_result;
        }
    }

    public static class Trans_result {
        //源文字
        String src;
        //目标文字
        String dst;

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getDst() {
            return dst;
        }

        public void setDst(String dst) {
            this.dst = dst;
        }
    }
}
