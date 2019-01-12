package cn.jackielee.biz.ranklist.common;

import java.io.Serializable;

/**
 * Created by lxb on 2019/1/7.
 */
public class DetailCommonVo implements Serializable{
    //排名
    private String rankNum;
    //名称
    private String title;
    //照片
    private String pic;
    //作者 （书籍，音乐）
    private String author;
    //译者 （书籍）
    private String translator;
    //出版社 （书籍）
    private String press;
    //专辑 （音乐）
    private String albumName;
    //导演 （电影）
    private String director;
    //日期
    private String date;
    //分数
    private String score;
    //评分总人数
    private String scoreNum;
    //跳转链接
    private String url;
    //描述
    private String desc;
    //类型
    private String type;
    //演员（电影）
    private String actor;
    //国家
    private String country;
    //时长 （电影 音乐）
    private String period;
    //大小 （电影，游戏）
    private String size;
    //价格
    private String price;

    public DetailCommonVo() {
    }

    public String getRankNum() {
        return this.rankNum;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPic() {
        return this.pic;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTranslator() {
        return this.translator;
    }

    public String getPress() {
        return this.press;
    }

    public String getAlbumName() {
        return this.albumName;
    }

    public String getDirector() {
        return this.director;
    }

    public String getDate() {
        return this.date;
    }

    public String getScore() {
        return this.score;
    }

    public String getScoreNum() {
        return this.scoreNum;
    }

    public String getUrl() {
        return this.url;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getType() {
        return this.type;
    }

    public String getActor() {
        return this.actor;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPeriod() {
        return this.period;
    }

    public String getSize() {
        return this.size;
    }

    public String getPrice() {
        return this.price;
    }

    public void setRankNum(String rankNum) {
        this.rankNum = rankNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setScoreNum(String scoreNum) {
        this.scoreNum = scoreNum;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DetailCommonVo)) return false;
        final DetailCommonVo other = (DetailCommonVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$rankNum = this.getRankNum();
        final Object other$rankNum = other.getRankNum();
        if (this$rankNum == null ? other$rankNum != null : !this$rankNum.equals(other$rankNum)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$pic = this.getPic();
        final Object other$pic = other.getPic();
        if (this$pic == null ? other$pic != null : !this$pic.equals(other$pic)) return false;
        final Object this$author = this.getAuthor();
        final Object other$author = other.getAuthor();
        if (this$author == null ? other$author != null : !this$author.equals(other$author)) return false;
        final Object this$translator = this.getTranslator();
        final Object other$translator = other.getTranslator();
        if (this$translator == null ? other$translator != null : !this$translator.equals(other$translator))
            return false;
        final Object this$press = this.getPress();
        final Object other$press = other.getPress();
        if (this$press == null ? other$press != null : !this$press.equals(other$press)) return false;
        final Object this$albumName = this.getAlbumName();
        final Object other$albumName = other.getAlbumName();
        if (this$albumName == null ? other$albumName != null : !this$albumName.equals(other$albumName)) return false;
        final Object this$director = this.getDirector();
        final Object other$director = other.getDirector();
        if (this$director == null ? other$director != null : !this$director.equals(other$director)) return false;
        final Object this$date = this.getDate();
        final Object other$date = other.getDate();
        if (this$date == null ? other$date != null : !this$date.equals(other$date)) return false;
        final Object this$score = this.getScore();
        final Object other$score = other.getScore();
        if (this$score == null ? other$score != null : !this$score.equals(other$score)) return false;
        final Object this$scoreNum = this.getScoreNum();
        final Object other$scoreNum = other.getScoreNum();
        if (this$scoreNum == null ? other$scoreNum != null : !this$scoreNum.equals(other$scoreNum)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$desc = this.getDesc();
        final Object other$desc = other.getDesc();
        if (this$desc == null ? other$desc != null : !this$desc.equals(other$desc)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$actor = this.getActor();
        final Object other$actor = other.getActor();
        if (this$actor == null ? other$actor != null : !this$actor.equals(other$actor)) return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$period = this.getPeriod();
        final Object other$period = other.getPeriod();
        if (this$period == null ? other$period != null : !this$period.equals(other$period)) return false;
        final Object this$size = this.getSize();
        final Object other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DetailCommonVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $rankNum = this.getRankNum();
        result = result * PRIME + ($rankNum == null ? 43 : $rankNum.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $pic = this.getPic();
        result = result * PRIME + ($pic == null ? 43 : $pic.hashCode());
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        final Object $translator = this.getTranslator();
        result = result * PRIME + ($translator == null ? 43 : $translator.hashCode());
        final Object $press = this.getPress();
        result = result * PRIME + ($press == null ? 43 : $press.hashCode());
        final Object $albumName = this.getAlbumName();
        result = result * PRIME + ($albumName == null ? 43 : $albumName.hashCode());
        final Object $director = this.getDirector();
        result = result * PRIME + ($director == null ? 43 : $director.hashCode());
        final Object $date = this.getDate();
        result = result * PRIME + ($date == null ? 43 : $date.hashCode());
        final Object $score = this.getScore();
        result = result * PRIME + ($score == null ? 43 : $score.hashCode());
        final Object $scoreNum = this.getScoreNum();
        result = result * PRIME + ($scoreNum == null ? 43 : $scoreNum.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $desc = this.getDesc();
        result = result * PRIME + ($desc == null ? 43 : $desc.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $actor = this.getActor();
        result = result * PRIME + ($actor == null ? 43 : $actor.hashCode());
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final Object $period = this.getPeriod();
        result = result * PRIME + ($period == null ? 43 : $period.hashCode());
        final Object $size = this.getSize();
        result = result * PRIME + ($size == null ? 43 : $size.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        return result;
    }

    public String toString() {
        return "DetailCommonVo(rankNum=" + this.getRankNum() + ", title=" + this.getTitle() + ", pic=" + this.getPic() + ", author=" + this.getAuthor() + ", translator=" + this.getTranslator() + ", press=" + this.getPress() + ", albumName=" + this.getAlbumName() + ", director=" + this.getDirector() + ", date=" + this.getDate() + ", score=" + this.getScore() + ", scoreNum=" + this.getScoreNum() + ", url=" + this.getUrl() + ", desc=" + this.getDesc() + ", type=" + this.getType() + ", actor=" + this.getActor() + ", country=" + this.getCountry() + ", period=" + this.getPeriod() + ", size=" + this.getSize() + ", price=" + this.getPrice() + ")";
    }
}
