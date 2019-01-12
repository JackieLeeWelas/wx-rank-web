package cn.jackielee.biz.ranklist.movie.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
public class DCMovieData {
    public static final String dCMovieDataStr = "[\n" +
            "    {\n" +
            "        \"title\": \"蚁人2：黄蜂女现身 Ant-Man and the Wasp\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_picer/public/p2529389608.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"223284人评价\",\n" +
            "        \"director\": \"佩顿·里德\",\n" +
            "        \"actor\": \"保罗·路德 / 伊万杰琳·莉莉 / 迈克尔·佩纳\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2018\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟3：无限战争 Avengers: Infinity War\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2517753454.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"438193人评价\",\n" +
            "        \"director\": \"安东尼·罗素 / 乔·罗素\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 克里斯·海姆斯沃斯 / 克里斯·埃文斯\",\n" +
            "        \"type\": \"动作 / 科幻 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2018\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神3：诸神黄昏 Thor: Ragnarok\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2500451074.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"236656人评价\",\n" +
            "        \"director\": \"塔伊加·维迪提\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯 / 汤姆·希德勒斯顿 / 凯特·布兰切特\",\n" +
            "        \"type\": \"动作 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2017\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蜘蛛侠：英雄归来 Spider-Man: Homecoming\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2497756471.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"242657人评价\",\n" +
            "        \"director\": \"乔·沃茨\",\n" +
            "        \"actor\": \"汤姆·赫兰德 / 小罗伯特·唐尼 / 玛丽莎·托梅\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2017\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"银河护卫队2 Guardians of the Galaxy Vol. 2\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2455261804.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"275949人评价\",\n" +
            "        \"director\": \"詹姆斯·古恩\",\n" +
            "        \"actor\": \"克里斯·帕拉特 / 佐伊·索尔达娜 / 戴夫·巴蒂斯塔\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2017\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"奇异博士 Doctor Strange\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2388501883.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"332614人评价\",\n" +
            "        \"director\": \"斯科特·德瑞克森\",\n" +
            "        \"actor\": \"本尼迪克特·康伯巴奇 / 蒂尔达·斯文顿 / 麦斯·米科尔森\",\n" +
            "        \"type\": \"动作 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2016\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国队长3 Captain America: Civil War\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2332503406.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"283579人评价\",\n" +
            "        \"director\": \"安东尼·罗素 / 乔·罗素\",\n" +
            "        \"actor\": \"克里斯·埃文斯 / 小罗伯特·唐尼 / 斯嘉丽·约翰逊\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2016\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蚁人 Ant-Man\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2266823371.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"264635人评价\",\n" +
            "        \"director\": \"佩顿·里德\",\n" +
            "        \"actor\": \"保罗·路德 / 迈克尔·道格拉斯 / 伊万杰琳·莉莉\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2015\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟2：奥创纪元 Avengers: Age of Ultron\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2237747953.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"284381人评价\",\n" +
            "        \"director\": \"乔斯·韦登\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 克里斯·海姆斯沃斯 / 马克·鲁弗洛\",\n" +
            "        \"type\": \"动作 / 科幻 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2015\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"银河护卫队 Guardians of the Galaxy\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2198455702.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"308884人评价\",\n" +
            "        \"director\": \"詹姆斯·古恩\",\n" +
            "        \"actor\": \"克里斯·帕拉特 / 佐伊·索尔达娜 / 布莱德利·库珀\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"date\": \"2014\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国队长2 Captain America: The Winter Soldier\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2174824694.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"269899人评价\",\n" +
            "        \"director\": \"安东尼·罗素 / 乔·罗素\",\n" +
            "        \"actor\": \"克里斯·埃文斯 / 斯嘉丽·约翰逊 / 塞巴斯蒂安·斯坦\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2014\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神2：黑暗世界 Thor: The Dark World\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p2156839164.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"188332人评价\",\n" +
            "        \"director\": \"阿兰·泰勒\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯 / 娜塔莉·波特曼 / 汤姆·希德勒斯顿\",\n" +
            "        \"type\": \"动作 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2013\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠3 Iron Man 3\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p1955027201.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"263491人评价\",\n" +
            "        \"director\": \"沙恩·布莱克\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 盖·皮尔斯 / 格温妮斯·帕特洛\",\n" +
            "        \"type\": \"动作 / 科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆\",\n" +
            "        \"date\": \"2013\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟 The Avengers\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p1524904031.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"397416人评价\",\n" +
            "        \"director\": \"乔斯·韦登\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 克里斯·埃文斯 / 斯嘉丽·约翰逊\",\n" +
            "        \"type\": \"动作 / 科幻 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2012\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国队长 Captain America: The First Avenger\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_picer/public/p1182659238.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"ratingNum\": \"192544人评价\",\n" +
            "        \"director\": \"乔·庄斯顿\",\n" +
            "        \"actor\": \"克里斯·埃文斯 / 海莉·阿特维尔 / 塞巴斯蒂安·斯坦\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2011\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神 Thor\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_picer/public/p2159068249.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"174171人评价\",\n" +
            "        \"director\": \"肯尼思·布拉纳\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯 / 娜塔莉·波特曼 / 汤姆·希德勒斯顿\",\n" +
            "        \"type\": \"动作 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2011\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"无敌浩克 The Incredible Hulk\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_picer/public/p2243996638.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"107156人评价\",\n" +
            "        \"director\": \"路易斯·莱特里尔\",\n" +
            "        \"actor\": \"爱德华·诺顿 / 丽芙·泰勒 / 蒂姆·罗斯\",\n" +
            "        \"type\": \"动作 / 科幻 / 惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2008\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠2 Iron Man 2\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p452861346.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"220777人评价\",\n" +
            "        \"director\": \"乔恩·费儒\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 格温妮斯·帕特洛 / 米基·洛克\",\n" +
            "        \"type\": \"动作 / 冒险 / 科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2010\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"绿巨人浩克 Hulk\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_picer/public/p2407903929.jpg\",\n" +
            "        \"score\": \"6.6\",\n" +
            "        \"ratingNum\": \"64285人评价\",\n" +
            "        \"director\": \"李安\",\n" +
            "        \"actor\": \"艾瑞克·巴纳 / 詹妮弗·康纳利 / 山姆·艾里奥特\",\n" +
            "        \"type\": \"剧情 / 动作 / 科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2003\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠 Iron Man\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_picer/public/p725871004.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"289476人评价\",\n" +
            "        \"director\": \"乔恩·费儒\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 泰伦斯·霍华德 / 格温妮斯·帕特洛\",\n" +
            "        \"type\": \"动作 / 冒险 / 科幻 / 惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"date\": \"2008\"\n" +
            "    }\n" +
            "]";
    public static List<JSONObject> dCMovieData = null;
    static {
        dCMovieData = JSON.parseObject(dCMovieDataStr,List.class);
    }
}
