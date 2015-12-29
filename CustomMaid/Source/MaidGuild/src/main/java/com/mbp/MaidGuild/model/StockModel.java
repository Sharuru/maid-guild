package com.mbp.MaidGuild.model;

/**
 * Created by Sharuru on 2015/11/24 0024.
 */
public class StockModel {
    public static class StockJson {
        //状态码
        String resultcode;
        //状态信息
        String reason;
        //结果集
        Result[] result;
        //错误码
        String error_code;

        public String getResultcode() {
            return resultcode;
        }

        public void setResultcode(String resultcode) {
            this.resultcode = resultcode;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public Result[] getResult() {
            return result;
        }

        public void setResult(Result[] result) {
            this.result = result;
        }

        public String getError_code() {
            return error_code;
        }

        public void setError_code(String error_code) {
            this.error_code = error_code;
        }
    }

    public static class Result {
        //详细数据
        Data data;
        //股票信息
        Dapandata dapandata;
        //图片
        Gopicture gopicture;

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public Dapandata getDapandata() {
            return dapandata;
        }

        public void setDapandata(Dapandata dapandata) {
            this.dapandata = dapandata;
        }

        public Gopicture getGopicture() {
            return gopicture;
        }

        public void setGopicture(Gopicture gopicture) {
            this.gopicture = gopicture;
        }
    }

    public static class Data {
        //代码
        String gid;
        //股票名
        String name;
        //今日开盘价
        String todayStartPri;
        //昨日收盘价
        String yestodEndPri;
        //现价
        String nowPri;
        //今日最高价
        String todayMax;
        //今日最低价
        String todayMin;
        //竞买价
        String competitivePri;
        //竞卖价
        String reservePri;
        //成交量
        String traNumber;
        //成交金额
        String traAmount;
        //买一
        String buyOne;
        //买一报价
        String buyOnePri;
        //买二
        String buyTwo;
        //买二报价
        String buyTwoPri;
        //买三
        String buyThree;
        //买三报价
        String buyThreePri;
        //买四
        String buyFour;
        //买四报价
        String buyFourPri;
        //买五
        String buyFive;
        //买五报价
        String buyFivePri;
        //卖一
        String sellOne;
        //卖一报价
        String sellOnePri;
        //卖二
        String sellTwo;
        //卖二报价
        String sellTwoPri;
        //卖三
        String sellThree;
        //卖三报价
        String sellThreePri;
        //卖四
        String sellFour;
        //卖四报价
        String sellFourPri;
        //卖五
        String sellFive;
        //卖五报价
        String sellFivePri;
        //日期
        String data;
        //时间
        String time;

        public String getGid() {
            return gid;
        }

        public void setGid(String gid) {
            this.gid = gid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTodayStartPri() {
            return todayStartPri;
        }

        public void setTodayStartPri(String todayStartPri) {
            this.todayStartPri = todayStartPri;
        }

        public String getYestodEndPri() {
            return yestodEndPri;
        }

        public void setYestodEndPri(String yestodEndPri) {
            this.yestodEndPri = yestodEndPri;
        }

        public String getNowPri() {
            return nowPri;
        }

        public void setNowPri(String nowPri) {
            this.nowPri = nowPri;
        }

        public String getTodayMax() {
            return todayMax;
        }

        public void setTodayMax(String todayMax) {
            this.todayMax = todayMax;
        }

        public String getTodayMin() {
            return todayMin;
        }

        public void setTodayMin(String todayMin) {
            this.todayMin = todayMin;
        }

        public String getCompetitivePri() {
            return competitivePri;
        }

        public void setCompetitivePri(String competitivePri) {
            this.competitivePri = competitivePri;
        }

        public String getReservePri() {
            return reservePri;
        }

        public void setReservePri(String reservePri) {
            this.reservePri = reservePri;
        }

        public String getTraNumber() {
            return traNumber;
        }

        public void setTraNumber(String traNumber) {
            this.traNumber = traNumber;
        }

        public String getTraAmount() {
            return traAmount;
        }

        public void setTraAmount(String traAmount) {
            this.traAmount = traAmount;
        }

        public String getBuyOne() {
            return buyOne;
        }

        public void setBuyOne(String buyOne) {
            this.buyOne = buyOne;
        }

        public String getBuyOnePri() {
            return buyOnePri;
        }

        public void setBuyOnePri(String buyOnePri) {
            this.buyOnePri = buyOnePri;
        }

        public String getBuyTwo() {
            return buyTwo;
        }

        public void setBuyTwo(String buyTwo) {
            this.buyTwo = buyTwo;
        }

        public String getBuyTwoPri() {
            return buyTwoPri;
        }

        public void setBuyTwoPri(String buyTwoPri) {
            this.buyTwoPri = buyTwoPri;
        }

        public String getBuyThree() {
            return buyThree;
        }

        public void setBuyThree(String buyThree) {
            this.buyThree = buyThree;
        }

        public String getBuyThreePri() {
            return buyThreePri;
        }

        public void setBuyThreePri(String buyThreePri) {
            this.buyThreePri = buyThreePri;
        }

        public String getBuyFour() {
            return buyFour;
        }

        public void setBuyFour(String buyFour) {
            this.buyFour = buyFour;
        }

        public String getBuyFourPri() {
            return buyFourPri;
        }

        public void setBuyFourPri(String buyFourPri) {
            this.buyFourPri = buyFourPri;
        }

        public String getBuyFive() {
            return buyFive;
        }

        public void setBuyFive(String buyFive) {
            this.buyFive = buyFive;
        }

        public String getBuyFivePri() {
            return buyFivePri;
        }

        public void setBuyFivePri(String buyFivePri) {
            this.buyFivePri = buyFivePri;
        }

        public String getSellOne() {
            return sellOne;
        }

        public void setSellOne(String sellOne) {
            this.sellOne = sellOne;
        }

        public String getSellOnePri() {
            return sellOnePri;
        }

        public void setSellOnePri(String sellOnePri) {
            this.sellOnePri = sellOnePri;
        }

        public String getSellTwo() {
            return sellTwo;
        }

        public void setSellTwo(String sellTwo) {
            this.sellTwo = sellTwo;
        }

        public String getSellTwoPri() {
            return sellTwoPri;
        }

        public void setSellTwoPri(String sellTwoPri) {
            this.sellTwoPri = sellTwoPri;
        }

        public String getSellThree() {
            return sellThree;
        }

        public void setSellThree(String sellThree) {
            this.sellThree = sellThree;
        }

        public String getSellThreePri() {
            return sellThreePri;
        }

        public void setSellThreePri(String sellThreePri) {
            this.sellThreePri = sellThreePri;
        }

        public String getSellFour() {
            return sellFour;
        }

        public void setSellFour(String sellFour) {
            this.sellFour = sellFour;
        }

        public String getSellFourPri() {
            return sellFourPri;
        }

        public void setSellFourPri(String sellFourPri) {
            this.sellFourPri = sellFourPri;
        }

        public String getSellFive() {
            return sellFive;
        }

        public void setSellFive(String sellFive) {
            this.sellFive = sellFive;
        }

        public String getSellFivePri() {
            return sellFivePri;
        }

        public void setSellFivePri(String sellFivePri) {
            this.sellFivePri = sellFivePri;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static class Dapandata {
        //大盘名称
        String name;
        //大盘当前点数
        String dot;
        //大盘当前价格
        String nowPic;
        //大盘涨跌率
        String rate;
        //大盘成交手
        String traNumber;
        //大盘成交金额
        String traAmountl;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDot() {
            return dot;
        }

        public void setDot(String dot) {
            this.dot = dot;
        }

        public String getNowPic() {
            return nowPic;
        }

        public void setNowPic(String nowPic) {
            this.nowPic = nowPic;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public String getTraNumber() {
            return traNumber;
        }

        public void setTraNumber(String traNumber) {
            this.traNumber = traNumber;
        }

        public String getTraAmountl() {
            return traAmountl;
        }

        public void setTraAmountl(String traAmountl) {
            this.traAmountl = traAmountl;
        }
    }

    public static class Gopicture {
        //分钟图
        String minurl;
        //日线图
        String dayurl;
        //周线图
        String weekurl;
        //月线图
        String monthurl;

        public String getMinurl() {
            return minurl;
        }

        public void setMinurl(String minurl) {
            this.minurl = minurl;
        }

        public String getDayurl() {
            return dayurl;
        }

        public void setDayurl(String dayurl) {
            this.dayurl = dayurl;
        }

        public String getWeekurl() {
            return weekurl;
        }

        public void setWeekurl(String weekurl) {
            this.weekurl = weekurl;
        }

        public String getMonthurl() {
            return monthurl;
        }

        public void setMonthurl(String monthurl) {
            this.monthurl = monthurl;
        }
    }

}
