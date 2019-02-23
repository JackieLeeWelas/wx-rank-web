package cn.jackielee.biz.ranklist.common.vo;

import java.io.Serializable;

/**
 * Created by lxb on 2019/1/7.
 */
public class ListCommonVo implements Serializable{
    //资源id
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRankNum() {
        return rankNum;
    }

    public void setRankNum(String rankNum) {
        this.rankNum = rankNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getScoreNum() {
        return scoreNum;
    }

    public void setScoreNum(String scoreNum) {
        this.scoreNum = scoreNum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ListCommonVo{" +
                "id=" + id +
                ", rankNum='" + rankNum + '\'' +
                ", title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                ", author='" + author + '\'' +
                ", translator='" + translator + '\'' +
                ", press='" + press + '\'' +
                ", albumName='" + albumName + '\'' +
                ", director='" + director + '\'' +
                ", date='" + date + '\'' +
                ", score='" + score + '\'' +
                ", scoreNum='" + scoreNum + '\'' +
                ", url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                ", type='" + type + '\'' +
                ", actor='" + actor + '\'' +
                ", country='" + country + '\'' +
                ", period='" + period + '\'' +
                ", size='" + size + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
