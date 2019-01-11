package cn.jackielee.biz.ranklist.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lxb on 2019/1/7.
 */
@Data
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
}
