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
            "        \"title\": \"蚁人2：黄蜂女现身Ant-ManandtheWasp\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2529389608.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"scoreNum\": \"223284人评价\",\n" +
            "        \"director\": \"佩顿·里德\",\n" +
            "        \"actor\": \"保罗·路德/伊万杰琳·莉莉/迈克尔·佩纳\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"id\": 26636712\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟3：无限战争Avengers: InfinityWar\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"438193人评价\",\n" +
            "        \"director\": \"安东尼·罗素/乔·罗素\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/克里斯·海姆斯沃斯/克里斯·埃文斯\",\n" +
            "        \"type\": \"动作/科幻/奇幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"id\": 24773958\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神3：诸神黄昏Thor: Ragnarok\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2500451074.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"scoreNum\": \"236656人评价\",\n" +
            "        \"director\": \"塔伊加·维迪提\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯/汤姆·希德勒斯顿/凯特·布兰切特\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"id\": 25821634\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蜘蛛侠：英雄归来Spider-Man: Homecoming\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2497756471.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"scoreNum\": \"242657人评价\",\n" +
            "        \"director\": \"乔·沃茨\",\n" +
            "        \"actor\": \"汤姆·赫兰德/小罗伯特·唐尼/玛丽莎·托梅\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"id\": 24753477\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"银河护卫队2GuardiansoftheGalaxyVol.2\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2455261804.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"275949人评价\",\n" +
            "        \"director\": \"詹姆斯·古恩\",\n" +
            "        \"actor\": \"克里斯·帕拉特/佐伊·索尔达娜/戴夫·巴蒂斯塔\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"id\": 25937854\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"奇异博士DoctorStrange\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2388501883.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"scoreNum\": \"332614人评价\",\n" +
            "        \"director\": \"斯科特·德瑞克森\",\n" +
            "        \"actor\": \"本尼迪克特·康伯巴奇/蒂尔达·斯文顿/麦斯·米科尔森\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"id\": 3025375\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国队长3CaptainAmerica: CivilWar\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2332503406.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"scoreNum\": \"283579人评价\",\n" +
            "        \"director\": \"安东尼·罗素/乔·罗素\",\n" +
            "        \"actor\": \"克里斯·埃文斯/小罗伯特·唐尼/斯嘉丽·约翰逊\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"id\": 25820460\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蚁人Ant-Man\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2266823371.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"scoreNum\": \"264635人评价\",\n" +
            "        \"director\": \"佩顿·里德\",\n" +
            "        \"actor\": \"保罗·路德/迈克尔·道格拉斯/伊万杰琳·莉莉\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"id\": 1866473\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟2：奥创纪元Avengers: AgeofUltron\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2237747953.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"scoreNum\": \"284381人评价\",\n" +
            "        \"director\": \"乔斯·韦登\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/克里斯·海姆斯沃斯/马克·鲁弗洛\",\n" +
            "        \"type\": \"动作/科幻/奇幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"id\": 10741834\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"银河护卫队GuardiansoftheGalaxy\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2198455702.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"308884人评价\",\n" +
            "        \"director\": \"詹姆斯·古恩\",\n" +
            "        \"actor\": \"克里斯·帕拉特/佐伊·索尔达娜/布莱德利·库珀\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"美国/英国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"id\": 7065154\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国队长2CaptainAmerica: TheWinterSoldier\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2174824694.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"scoreNum\": \"269899人评价\",\n" +
            "        \"director\": \"安东尼·罗素/乔·罗素\",\n" +
            "        \"actor\": \"克里斯·埃文斯/斯嘉丽·约翰逊/塞巴斯蒂安·斯坦\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"id\": 6390823\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神2：黑暗世界Thor: TheDarkWorld\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2156839164.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"scoreNum\": \"188332人评价\",\n" +
            "        \"director\": \"阿兰·泰勒\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯/娜塔莉·波特曼/汤姆·希德勒斯顿\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"id\": 6560058\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠3IronMan3\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1955027201.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"scoreNum\": \"263491人评价\",\n" +
            "        \"director\": \"沙恩·布莱克\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/盖·皮尔斯/格温妮斯·帕特洛\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"美国/中国大陆\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"id\": 3231742\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟TheAvengers\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1524904031.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"scoreNum\": \"397416人评价\",\n" +
            "        \"director\": \"乔斯·韦登\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/克里斯·埃文斯/斯嘉丽·约翰逊\",\n" +
            "        \"type\": \"动作/科幻/奇幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"id\": 1866479\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国队长CaptainAmerica: TheFirstAvenger\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p1182659238.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"scoreNum\": \"192544人评价\",\n" +
            "        \"director\": \"乔·庄斯顿\",\n" +
            "        \"actor\": \"克里斯·埃文斯/海莉·阿特维尔/塞巴斯蒂安·斯坦\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"id\": 2138838\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神Thor\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2159068249.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"scoreNum\": \"174171人评价\",\n" +
            "        \"director\": \"肯尼思·布拉纳\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯/娜塔莉·波特曼/汤姆·希德勒斯顿\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"id\": 1866471\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"无敌浩克TheIncredibleHulk\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2243996638.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"scoreNum\": \"107156人评价\",\n" +
            "        \"director\": \"路易斯·莱特里尔\",\n" +
            "        \"actor\": \"爱德华·诺顿/丽芙·泰勒/蒂姆·罗斯\",\n" +
            "        \"type\": \"动作/科幻/惊悚\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"id\": 1866475\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠2IronMan2\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p452861346.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"scoreNum\": \"220777人评价\",\n" +
            "        \"director\": \"乔恩·费儒\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/格温妮斯·帕特洛/米基·洛克\",\n" +
            "        \"type\": \"动作/冒险/科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"id\": 3066739\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"绿巨人浩克Hulk\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2407903929.jpg\",\n" +
            "        \"score\": \"6.6\",\n" +
            "        \"scoreNum\": \"64285人评价\",\n" +
            "        \"director\": \"李安\",\n" +
            "        \"actor\": \"艾瑞克·巴纳/詹妮弗·康纳利/山姆·艾里奥特\",\n" +
            "        \"type\": \"剧情/动作/科幻\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"id\": 1307354\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠IronMan\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p725871004.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"scoreNum\": \"289476人评价\",\n" +
            "        \"director\": \"乔恩·费儒\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/泰伦斯·霍华德/格温妮斯·帕特洛\",\n" +
            "        \"type\": \"动作/冒险/科幻/惊悚\",\n" +
            "        \"country\": \"美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"id\": 1432146\n" +
            "    }\n" +
            "]";
    public static List<JSONObject> dCMovieData = null;
    static {
        dCMovieData = JSON.parseObject(dCMovieDataStr,List.class);
    }
}
