package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/19 0019.
 */
public class TranslationModel {

    public static class TranslationJson {
        //状态码
        String error_code;
        //状态信息
        String error_msg;
        //源语言
        String from;
        //目标语言
        String to;
        //翻译结果
        Trans_result[] trans_result;

        public String getError_code() {
            return error_code;
        }

        public void setError_code(String error_code) {
            this.error_code = error_code;
        }

        public String getError_msg() {
            return error_msg;
        }

        public void setError_msg(String error_msg) {
            this.error_msg = error_msg;
        }

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
