package cn.jackielee.biz.ranklist.movie.source;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by lxb on 2019/1/12.
 */
public class WorldTicketTopMovieData {
    public static final StringBuffer worldTicketTopMovieDataStr = new StringBuffer().append("[\n" +
            "    {\n" +
            "        \"title\": \"阿凡达 Avatar\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2180085848.jpg\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"ratingNum\": \"647409人评价\",\n" +
            "        \"director\": \"詹姆斯·卡梅隆\",\n" +
            "        \"actor\": \"萨姆·沃辛顿 / 佐伊·索尔达娜 / 西格妮·韦弗\",\n" +
            "        \"type\": \"动作 / 战争 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$2,788.0 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"泰坦尼克号 Titanic\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p457760035.jpg\",\n" +
            "        \"score\": \"9.3\",\n" +
            "        \"ratingNum\": \"902391人评价\",\n" +
            "        \"director\": \"詹姆斯·卡梅隆\",\n" +
            "        \"actor\": \"莱昂纳多·迪卡普里奥 / 凯特·温丝莱特 / 比利·赞恩\",\n" +
            "        \"type\": \"剧情 / 爱情 / 灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1997\",\n" +
            "        \"ticket\": \"$2,187.5 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战7：原力觉醒 Star Wars: The Force Awakens\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2293954118.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"155294人评价\",\n" +
            "        \"director\": \"J·J·艾布拉姆斯\",\n" +
            "        \"actor\": \"黛西·雷德利 / 约翰·博耶加 / 哈里森·福特\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$2,068.2 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟3：无限战争 Avengers: Infinity War\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2517753454.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"438279人评价\",\n" +
            "        \"director\": \"安东尼·罗素 / 乔·罗素\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 克里斯·海姆斯沃斯 / 克里斯·埃文斯\",\n" +
            "        \"type\": \"动作 / 科幻 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$2,046.5 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"侏罗纪世界 Jurassic World\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2246217861.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"255197人评价\",\n" +
            "        \"director\": \"科林·特雷沃罗\",\n" +
            "        \"actor\": \"克里斯·帕拉特 / 布莱丝·达拉斯·霍华德 / 文森特·多诺费奥\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$1,671.7 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟 The Avengers\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1524904031.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"397460人评价\",\n" +
            "        \"director\": \"乔斯·韦登\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 克里斯·埃文斯 / 斯嘉丽·约翰逊\",\n" +
            "        \"type\": \"动作 / 科幻 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$1,518.8 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"速度与激情7 Furious 7\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2233706697.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"297977人评价\",\n" +
            "        \"director\": \"温子仁\",\n" +
            "        \"actor\": \"范·迪塞尔 / 保罗·沃克 / 杰森·斯坦森\",\n" +
            "        \"type\": \"动作 / 犯罪 / 惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆/日本\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$1,516.0 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"复仇者联盟2：奥创纪元 Avengers: Age of Ultron\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2237747953.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"284428人评价\",\n" +
            "        \"director\": \"乔斯·韦登\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 克里斯·海姆斯沃斯 / 马克·鲁弗洛\",\n" +
            "        \"type\": \"动作 / 科幻 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$1,405.4 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"黑豹 Black Panther\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2512123434.jpg\",\n" +
            "        \"score\": \"6.4\",\n" +
            "        \"ratingNum\": \"239960人评价\",\n" +
            "        \"director\": \"瑞恩·库格勒\",\n" +
            "        \"actor\": \"查德维克·博斯曼 / 露皮塔·尼永奥 / 迈克尔·B·乔丹\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$1,346.8 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哈利·波特与死亡圣器(下) Harry Potter and the Deathly Hallows: Part 2\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p917846733.jpg\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"ratingNum\": \"338571人评价\",\n" +
            "        \"director\": \"大卫·叶茨\",\n" +
            "        \"actor\": \"丹尼尔·雷德克里夫 / 艾玛·沃森 / 鲁伯特·格林特\",\n" +
            "        \"type\": \"剧情 / 悬疑 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$1,341.5 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战8：最后的绝地武士 Star Wars: The Last Jedi\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"97775人评价\",\n" +
            "        \"director\": \"莱恩·约翰逊\",\n" +
            "        \"actor\": \"马克·哈米尔 / 凯丽·费雪 / 黛西·雷德利\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$1,332.5 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"侏罗纪世界2 Jurassic World: Fallen Kingdom\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522069454.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"ratingNum\": \"225060人评价\",\n" +
            "        \"director\": \"胡安·安东尼奥·巴亚纳\",\n" +
            "        \"actor\": \"克里斯·帕拉特 / 布莱丝·达拉斯·霍华德 / 贾斯蒂斯·史密斯\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/西班牙\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$1,304.8 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"冰雪奇缘 Frozen\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2166640945.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"353942人评价\",\n" +
            "        \"director\": \"克里斯·巴克 / 珍妮弗·李\",\n" +
            "        \"actor\": \"克里斯汀·贝尔 / 伊迪娜·门泽尔 / 乔纳森·格罗夫\",\n" +
            "        \"type\": \"喜剧 / 动画 / 奇幻 / 歌舞\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$1,276.5 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美女与野兽 Beauty and the Beast\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2417948644.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"208062人评价\",\n" +
            "        \"director\": \"比尔·康顿\",\n" +
            "        \"actor\": \"艾玛·沃森 / 丹·史蒂文斯 / 卢克·伊万斯\",\n" +
            "        \"type\": \"爱情 / 奇幻 / 歌舞\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$1,263.5 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"超人总动员2 Incredibles 2\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2522880251.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"122199人评价\",\n" +
            "        \"director\": \"布拉德·伯德\",\n" +
            "        \"actor\": \"格雷格·T·尼尔森 / 霍利·亨特 / 莎拉·沃威尔\",\n" +
            "        \"type\": \"喜剧 / 动作 / 动画 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$1,238.6 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"速度与激情8 The Fate of the Furious\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2444256500.jpg\",\n" +
            "        \"score\": \"7.0\",\n" +
            "        \"ratingNum\": \"227224人评价\",\n" +
            "        \"director\": \"F·加里·格雷\",\n" +
            "        \"actor\": \"范·迪塞尔 / 道恩·强森 / 查理兹·塞隆\",\n" +
            "        \"type\": \"动作 / 犯罪\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$1,236.0 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠3 Iron Man 3\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1955027201.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"263528人评价\",\n" +
            "        \"director\": \"沙恩·布莱克\",\n" +
            "        \"actor\": \"小罗伯特·唐尼 / 盖·皮尔斯 / 格温妮斯·帕特洛\",\n" +
            "        \"type\": \"动作 / 科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$1,214.8 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小黄人大眼萌 Minions\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2265761240.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"156548人评价\",\n" +
            "        \"director\": \"凯尔·巴尔达 / 皮埃尔·柯芬\",\n" +
            "        \"actor\": \"桑德拉·布洛克 / 乔恩·哈姆 / 迈克尔·基顿\",\n" +
            "        \"type\": \"喜剧 / 动画\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$1,159.4 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国队长3 Captain America: Civil War\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2332503406.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"283613人评价\",\n" +
            "        \"director\": \"安东尼·罗素 / 乔·罗素\",\n" +
            "        \"actor\": \"克里斯·埃文斯 / 小罗伯特·唐尼 / 斯嘉丽·约翰逊\",\n" +
            "        \"type\": \"动作 / 科幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$1,153.3 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"变形金刚3 Transformers: Dark of the Moon\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1056093671.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"235327人评价\",\n" +
            "        \"director\": \"迈克尔·贝\",\n" +
            "        \"actor\": \"希亚·拉博夫 / 罗茜·汉丁顿-惠特莉 / 乔什·杜哈明\",\n" +
            "        \"type\": \"动作 / 科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$1,123.8 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"指环王3：王者无敌 The Lord of the Rings: The Return of the King\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1910825503.jpg\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"ratingNum\": \"361395人评价\",\n" +
            "        \"director\": \"彼得·杰克逊\",\n" +
            "        \"actor\": \"维果·莫腾森 / 伊莱贾·伍德 / 西恩·奥斯汀\",\n" +
            "        \"type\": \"剧情 / 动作 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/新西兰\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$1,119.9 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"007：大破天幕杀机 Skyfall\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1706050033.jpg\",\n" +
            "        \"score\": \"7.0\",\n" +
            "        \"ratingNum\": \"180839人评价\",\n" +
            "        \"director\": \"萨姆·门德斯\",\n" +
            "        \"actor\": \"丹尼尔·克雷格 / 朱迪·丹奇 / 哈维尔·巴登\",\n" +
            "        \"type\": \"动作 / 惊悚 / 犯罪 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$1,108.6 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"变形金刚4：绝迹重生 Transformers: Age of Extinction\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2187231762.jpg\",\n" +
            "        \"score\": \"6.5\",\n" +
            "        \"ratingNum\": \"217819人评价\",\n" +
            "        \"director\": \"迈克尔·贝\",\n" +
            "        \"actor\": \"马克·沃尔伯格 / 斯坦利·图齐 / 凯尔希·格兰莫\",\n" +
            "        \"type\": \"动作 / 科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$1,104.1 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蝙蝠侠：黑暗骑士崛起 The Dark Knight Rises\",\n" +
            "        \"pic\": \"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1706428744.jpg\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"ratingNum\": \"350639人评价\",\n" +
            "        \"director\": \"克里斯托弗·诺兰\",\n" +
            "        \"actor\": \"克里斯蒂安·贝尔 / 汤姆·哈迪 / 安妮·海瑟薇\",\n" +
            "        \"type\": \"剧情 / 动作 / 科幻 / 犯罪 / 惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$1,084.9 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"玩具总动员3 Toy Story 3\",\n" +
            "        \"pic\": \"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p1283675359.jpg\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"ratingNum\": \"228225人评价\",\n" +
            "        \"director\": \"李·昂克里奇\",\n" +
            "        \"actor\": \"汤姆·汉克斯 / 蒂姆·艾伦 / 琼·库萨克\",\n" +
            "        \"type\": \"喜剧 / 动画 / 奇幻 / 冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$1,067.0 百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"加勒比海盗2：聚魂棺 Pirates of the Caribbean: Dead Man'sChest\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1076822803.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"234657人评价\",\n" +
            "        \"director\": \"戈尔·维宾斯基\",\n" +
            "        \"actor\": \"约翰尼·德普/奥兰多·布鲁姆/凯拉·奈特莉\",\n" +
            "        \"type\": \"动作/冒险/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$1,066.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战外传：侠盗一号RogueOne: AStarWarsStory\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2403049086.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"126286人评价\",\n" +
            "        \"director\": \"加里斯·爱德华斯\",\n" +
            "        \"actor\": \"菲丽希缇·琼斯/迭戈·卢纳/甄子丹\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$1,056.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"加勒比海盗4：惊涛怪浪PiratesoftheCaribbean: OnStrangerTides\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p995422651.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"232215人评价\",\n" +
            "        \"director\": \"罗伯·马歇尔\",\n" +
            "        \"actor\": \"约翰尼·德普/佩内洛普·克鲁兹/杰弗里·拉什\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$1,045.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"神偷奶爸3DespicableMe3\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2469070974.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"153179人评价\",\n" +
            "        \"director\": \"凯尔·巴尔达/皮埃尔·柯芬/埃里克·吉隆\",\n" +
            "        \"actor\": \"史蒂夫·卡瑞尔/克里斯汀·韦格/崔·帕克\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$1,034.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"侏罗纪公园JurassicPark\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2076443176.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"186725人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"山姆·尼尔/劳拉·邓恩/杰夫·高布伦\",\n" +
            "        \"type\": \"科幻/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1993\",\n" +
            "        \"ticket\": \"$1,029.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"海底总动员2：多莉去哪儿FindingDory\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2356015154.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"64485人评价\",\n" +
            "        \"director\": \"安德鲁·斯坦顿/安格斯·麦克莱恩\",\n" +
            "        \"actor\": \"艾伦·德杰尼勒斯/艾伯特·布鲁克斯/艾德·奥尼尔\",\n" +
            "        \"type\": \"喜剧/动画/冒险/家庭\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$1,028.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战前传1：幽灵的威胁StarWars: EpisodeI-ThePhantomMenace\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2308392633.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"71386人评价\",\n" +
            "        \"director\": \"乔治·卢卡斯\",\n" +
            "        \"actor\": \"连姆·尼森/伊万·麦克格雷格/娜塔莉·波特曼\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1999\",\n" +
            "        \"ticket\": \"$1,027.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"爱丽丝梦游仙境AliceinWonderland\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p481556187.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"244900人评价\",\n" +
            "        \"director\": \"蒂姆·波顿\",\n" +
            "        \"actor\": \"米娅·华希科沃斯卡/约翰尼·德普/海伦娜·伯翰·卡特\",\n" +
            "        \"type\": \"奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$1,025.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"疯狂动物城Zootopia\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2315672647.jpg\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"ratingNum\": \"730961人评价\",\n" +
            "        \"director\": \"拜伦·霍华德/瑞奇·摩尔/杰拉德·布什\",\n" +
            "        \"actor\": \"金妮弗·古德温/杰森·贝特曼/伊德里斯·艾尔巴\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$1,023.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"霍比特人1：意外之旅TheHobbit: AnUnexpectedJourney\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1716297390.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"254419人评价\",\n" +
            "        \"director\": \"彼得·杰克逊\",\n" +
            "        \"actor\": \"伊恩·麦克莱恩/马丁·弗瑞曼/理查德·阿米蒂奇\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/新西兰\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$1,021.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蝙蝠侠：黑暗骑士TheDarkKnight\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p462657443.jpg\",\n" +
            "        \"score\": \"9.1\",\n" +
            "        \"ratingNum\": \"441353人评价\",\n" +
            "        \"director\": \"克里斯托弗·诺兰\",\n" +
            "        \"actor\": \"克里斯蒂安·贝尔/希斯·莱杰/艾伦·艾克哈特\",\n" +
            "        \"type\": \"剧情/动作/科幻/犯罪/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$1,004.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哈利·波特与魔法石HarryPotterandtheSorcerer'sStone\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p804947166.jpg\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"ratingNum\": \"358875人评价\",\n" +
            "        \"director\": \"克里斯·哥伦布\",\n" +
            "        \"actor\": \"丹尼尔·雷德克里夫/艾玛·沃森/鲁伯特·格林特\",\n" +
            "        \"type\": \"奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2001\",\n" +
            "        \"ticket\": \"$974.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"神偷奶爸2DespicableMe2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2164225595.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"266640人评价\",\n" +
            "        \"director\": \"皮埃尔·柯芬/克里斯·雷纳德\",\n" +
            "        \"actor\": \"史蒂夫·卡瑞尔/克里斯汀·韦格/本杰明·布拉特\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$970.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"狮子王TheLionKing\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p726659067.jpg\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"ratingNum\": \"357860人评价\",\n" +
            "        \"director\": \"罗杰·阿勒斯/罗伯·明可夫\",\n" +
            "        \"actor\": \"乔纳森·泰勒·托马斯/马修·布罗德里克/杰瑞米·艾恩斯\",\n" +
            "        \"type\": \"剧情/动画/冒险/歌舞/家庭\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1994\",\n" +
            "        \"ticket\": \"$968.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"奇幻森林TheJungleBook\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2326337223.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"176294人评价\",\n" +
            "        \"director\": \"乔恩·费儒\",\n" +
            "        \"actor\": \"尼尔·塞西/比尔·默瑞/本·金斯利\",\n" +
            "        \"type\": \"剧情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$966.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"加勒比海盗3：世界的尽头PiratesoftheCaribbean: AtWorld'sEnd\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1076818175.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"218721人评价\",\n" +
            "        \"director\": \"戈尔·维宾斯基\",\n" +
            "        \"actor\": \"约翰尼·德普/杰弗里·拉什/奥兰多·布鲁姆\",\n" +
            "        \"type\": \"动作/冒险/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$963.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"勇敢者游戏：决战丛林Jumanji: WelcometotheJungle\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2506258944.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"119834人评价\",\n" +
            "        \"director\": \"杰克·卡斯丹\",\n" +
            "        \"actor\": \"道恩·强森/凯文·哈特/杰克·布莱克\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$962.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哈利·波特与死亡圣器(上)HarryPotterandtheDeathlyHallows: Part1\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p721429854.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"217358人评价\",\n" +
            "        \"director\": \"大卫·叶茨\",\n" +
            "        \"actor\": \"丹尼尔·雷德克里夫/艾玛·沃森/鲁伯特·格林特\",\n" +
            "        \"type\": \"剧情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$960.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"霍比特人2：史矛革之战TheHobbit: TheDesolationofSmaug\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2166784595.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"221263人评价\",\n" +
            "        \"director\": \"彼得·杰克逊\",\n" +
            "        \"actor\": \"伊恩·麦克莱恩/马丁·弗瑞曼/理查德·阿米蒂奇\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/新西兰\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$958.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"霍比特人3：五军之战TheHobbit: TheBattleoftheFiveArmies\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2219406504.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"222121人评价\",\n" +
            "        \"director\": \"彼得·杰克逊\",\n" +
            "        \"actor\": \"马丁·弗瑞曼/伊恩·麦克莱恩/理查德·阿米蒂奇\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/新西兰\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$956.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"海底总动员FindingNemo\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1755893801.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"230097人评价\",\n" +
            "        \"director\": \"安德鲁·斯坦顿/李·昂克里奇\",\n" +
            "        \"actor\": \"艾伯特·布鲁克斯/艾伦·德杰尼勒斯/亚历山大·古尔德\",\n" +
            "        \"type\": \"动画/冒险/喜剧/家庭\",\n" +
            "        \"country\": \"制片国家/地区: 美国/澳大利亚\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$940.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哈利·波特与凤凰社HarryPotterandtheOrderofthePhoenix\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p443403700.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"195751人评价\",\n" +
            "        \"director\": \"大卫·叶茨\",\n" +
            "        \"actor\": \"丹尼尔·雷德克里夫/艾玛·沃森/鲁伯特·格林特\",\n" +
            "        \"type\": \"奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$939.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哈利·波特与混血王子HarryPotterandtheHalf-BloodPrince\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1108070214.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"197498人评价\",\n" +
            "        \"director\": \"大卫·叶茨\",\n" +
            "        \"actor\": \"丹尼尔·雷德克里夫/艾玛·沃森/鲁伯特·格林特\",\n" +
            "        \"type\": \"剧情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$934.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"指环王2：双塔奇兵TheLordoftheRings: TheTwoTowers\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p909265336.jpg\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"ratingNum\": \"338936人评价\",\n" +
            "        \"director\": \"彼得·杰克逊\",\n" +
            "        \"actor\": \"伊莱贾·伍德/西恩·奥斯汀/伊恩·麦克莱恩\",\n" +
            "        \"type\": \"剧情/动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/新西兰\",\n" +
            "        \"year\": \"2002\",\n" +
            "        \"ticket\": \"$926.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"怪物史瑞克2Shrek2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1910896984.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"73394人评价\",\n" +
            "        \"director\": \"安德鲁·亚当森/凯利·阿斯博瑞/康拉德·弗农\",\n" +
            "        \"actor\": \"麦克·梅尔斯/艾迪·墨菲/卡梅隆·迪亚兹\",\n" +
            "        \"type\": \"动画/冒险/喜剧/家庭/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2004\",\n" +
            "        \"ticket\": \"$919.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哈利·波特与火焰杯HarryPotterandtheGobletofFire\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p735391084.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"207458人评价\",\n" +
            "        \"director\": \"迈克·内威尔\",\n" +
            "        \"actor\": \"丹尼尔·雷德克里夫/艾玛·沃森/鲁伯特·格林特\",\n" +
            "        \"type\": \"奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2005\",\n" +
            "        \"ticket\": \"$896.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蜘蛛侠3Spider-Man3\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1344981868.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"125267人评价\",\n" +
            "        \"director\": \"山姆·雷米\",\n" +
            "        \"actor\": \"托比·马奎尔/克斯汀·邓斯特/詹姆斯·弗兰科\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$890.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"冰川时代3IceAge: DawnoftheDinosaurs\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2213132432.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"162985人评价\",\n" +
            "        \"director\": \"卡洛斯·沙尔丹哈/麦克·特米尔\",\n" +
            "        \"actor\": \"雷·罗马诺/约翰·雷吉扎莫/丹尼斯·利瑞\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$886.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"007：幽灵党Spectre\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2276234635.jpg\",\n" +
            "        \"score\": \"6.2\",\n" +
            "        \"ratingNum\": \"125616人评价\",\n" +
            "        \"director\": \"萨姆·门德斯\",\n" +
            "        \"actor\": \"丹尼尔·克雷格/克里斯托弗·沃尔兹/蕾雅·赛杜\",\n" +
            "        \"type\": \"动作/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$880.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蜘蛛侠：英雄归来Spider-Man: Homecoming\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2497756471.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"242703人评价\",\n" +
            "        \"director\": \"乔·沃茨\",\n" +
            "        \"actor\": \"汤姆·赫兰德/小罗伯特·唐尼/玛丽莎·托梅\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$880.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哈利·波特与密室HarryPotterandtheChamberofSecrets\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1082651990.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"229805人评价\",\n" +
            "        \"director\": \"克里斯·哥伦布\",\n" +
            "        \"actor\": \"丹尼尔·雷德克里夫/艾玛·沃森/鲁伯特·格林特\",\n" +
            "        \"type\": \"奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国/德国\",\n" +
            "        \"year\": \"2002\",\n" +
            "        \"ticket\": \"$879.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"冰川时代4IceAge: ContinentalDrift\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1596241117.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"159932人评价\",\n" +
            "        \"director\": \"麦克·特米尔/史蒂夫·马蒂诺\",\n" +
            "        \"actor\": \"阿兹·安萨里/乔·贝哈/克里斯托弗·坎贝尔\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$877.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"爱宠大机密TheSecretLifeofPets\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2363369616.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"147765人评价\",\n" +
            "        \"director\": \"克里斯·雷纳德/亚罗·切尼\",\n" +
            "        \"actor\": \"路易·C·K/艾瑞克·斯通斯崔特/凯文·哈特\",\n" +
            "        \"type\": \"喜剧/动画\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$875.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蝙蝠侠大战超人：正义黎明BatmanvSuperman: DawnofJustice\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2316834186.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"ratingNum\": \"171480人评价\",\n" +
            "        \"director\": \"扎克·施奈德\",\n" +
            "        \"actor\": \"本·阿弗莱克/亨利·卡维尔/艾米·亚当斯\",\n" +
            "        \"type\": \"动作/科幻/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$873.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"指环王1：魔戒再现TheLordoftheRings: TheFellowshipoftheRing\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1354436051.jpg\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"ratingNum\": \"379477人评价\",\n" +
            "        \"director\": \"彼得·杰克逊\",\n" +
            "        \"actor\": \"伊莱贾·伍德/西恩·奥斯汀/伊恩·麦克莱恩\",\n" +
            "        \"type\": \"剧情/动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 新西兰/美国\",\n" +
            "        \"year\": \"2001\",\n" +
            "        \"ticket\": \"$871.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"战狼2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2494701965.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"576785人评价\",\n" +
            "        \"director\": \"吴京\",\n" +
            "        \"actor\": \"吴京/弗兰克·格里罗/吴刚\",\n" +
            "        \"type\": \"动作\",\n" +
            "        \"country\": \"制片国家/地区: 中国大陆\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$870.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"饥饿游戏2：星火燎原TheHungerGames: CatchingFire\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2156684911.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"161762人评价\",\n" +
            "        \"director\": \"弗朗西斯·劳伦斯\",\n" +
            "        \"actor\": \"詹妮弗·劳伦斯/乔什·哈切森/利亚姆·海姆斯沃斯\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$865.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"银河护卫队2GuardiansoftheGalaxyVol.2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2455261804.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"276000人评价\",\n" +
            "        \"director\": \"詹姆斯·古恩\",\n" +
            "        \"actor\": \"克里斯·帕拉特/佐伊·索尔达娜/戴夫·巴蒂斯塔\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$863.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"头脑特工队InsideOut\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2266293606.jpg\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"ratingNum\": \"282229人评价\",\n" +
            "        \"director\": \"彼特·道格特/罗纳尔多·德尔·卡门\",\n" +
            "        \"actor\": \"艾米·波勒/菲利丝·史密斯/理查德·坎德\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$857.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神3：诸神黄昏Thor: Ragnarok\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2500451074.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"236707人评价\",\n" +
            "        \"director\": \"塔伊加·维迪提\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯/汤姆·希德勒斯顿/凯特·布兰切特\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$854.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战前传3：西斯的复仇StarWars: EpisodeIII-RevengeoftheSith\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p533908031.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"63196人评价\",\n" +
            "        \"director\": \"乔治·卢卡斯\",\n" +
            "        \"actor\": \"伊万·麦克格雷格/娜塔莉·波特曼/海登·克里斯滕森\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2005\",\n" +
            "        \"ticket\": \"$848.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"变形金刚2Transformers: RevengeoftheFallen\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1076838705.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"249404人评价\",\n" +
            "        \"director\": \"迈克尔·贝\",\n" +
            "        \"actor\": \"希亚·拉博夫/梅根·福克斯/乔什·杜哈明\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$836.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"暮光之城4：破晓(下)TheTwilightSaga: BreakingDawn-Part2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1725916674.jpg\",\n" +
            "        \"score\": \"6.6\",\n" +
            "        \"ratingNum\": \"75662人评价\",\n" +
            "        \"director\": \"比尔·康顿\",\n" +
            "        \"actor\": \"罗伯特·帕丁森/克里斯汀·斯图尔特/泰勒·洛特纳\",\n" +
            "        \"type\": \"剧情/爱情/惊悚/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$829.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"盗梦空间Inception\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p513344864.jpg\",\n" +
            "        \"score\": \"9.3\",\n" +
            "        \"ratingNum\": \"981587人评价\",\n" +
            "        \"director\": \"克里斯托弗·诺兰\",\n" +
            "        \"actor\": \"莱昂纳多·迪卡普里奥/约瑟夫·高登-莱维特/艾伦·佩吉\",\n" +
            "        \"type\": \"剧情/科幻/悬疑/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$828.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"毒液：致命守护者Venom\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2537158013.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"315820人评价\",\n" +
            "        \"director\": \"鲁本·弗雷斯彻\",\n" +
            "        \"actor\": \"汤姆·哈迪/米歇尔·威廉姆斯/里兹·阿迈德\",\n" +
            "        \"type\": \"动作/科幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$822.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"神奇女侠WonderWoman\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2460006593.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"279113人评价\",\n" +
            "        \"director\": \"派蒂·杰金斯\",\n" +
            "        \"actor\": \"盖尔·加朵/克里斯·派恩/康妮·尼尔森\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$821.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蜘蛛侠Spider-Man\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p457050361.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"195974人评价\",\n" +
            "        \"director\": \"山姆·雷米\",\n" +
            "        \"actor\": \"托比·马奎尔/威廉·达福/克斯汀·邓斯特\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2002\",\n" +
            "        \"ticket\": \"$821.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"独立日IndependenceDay\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p453518655.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"158248人评价\",\n" +
            "        \"director\": \"罗兰·艾默里奇\",\n" +
            "        \"actor\": \"威尔·史密斯/比尔·普尔曼/杰夫·高布伦\",\n" +
            "        \"type\": \"动作/科幻/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1996\",\n" +
            "        \"ticket\": \"$817.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"神奇动物在哪里FantasticBeastsandWheretoFindThem\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2392444121.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"349032人评价\",\n" +
            "        \"director\": \"大卫·叶茨\",\n" +
            "        \"actor\": \"埃迪·雷德梅恩/凯瑟琳·沃特斯顿/丹·福勒\",\n" +
            "        \"type\": \"剧情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$814.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"寻梦环游记Coco\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.jpg\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"ratingNum\": \"609264人评价\",\n" +
            "        \"director\": \"李·昂克里奇/阿德里安·莫利纳\",\n" +
            "        \"actor\": \"安东尼·冈萨雷斯/盖尔·加西亚·贝纳尔/本杰明·布拉特\",\n" +
            "        \"type\": \"喜剧/动画/奇幻/音乐\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$807.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"怪物史瑞克3ShrektheThird\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p577871352.jpg\",\n" +
            "        \"score\": \"7.2\",\n" +
            "        \"ratingNum\": \"49816人评价\",\n" +
            "        \"director\": \"克里斯·米勒/许诚毅\",\n" +
            "        \"actor\": \"麦克·梅尔斯/艾迪·墨菲/卡梅隆·迪亚兹\",\n" +
            "        \"type\": \"动画/冒险/喜剧/家庭/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$799.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哈利·波特与阿兹卡班的囚徒HarryPotterandthePrisonerofAzkaban\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1910812549.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"214698人评价\",\n" +
            "        \"director\": \"阿方索·卡隆\",\n" +
            "        \"actor\": \"丹尼尔·雷德克里夫/艾玛·沃森/鲁伯特·格林特\",\n" +
            "        \"type\": \"剧情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2004\",\n" +
            "        \"ticket\": \"$796.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"加勒比海盗5：死无对证PiratesoftheCaribbean: DeadMenTellNoTales\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2459723975.jpg\",\n" +
            "        \"score\": \"7.2\",\n" +
            "        \"ratingNum\": \"220770人评价\",\n" +
            "        \"director\": \"艾斯彭·山德伯格/乔阿吉姆·罗恩尼\",\n" +
            "        \"actor\": \"约翰尼·德普/哈维尔·巴登/杰弗里·拉什\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$794.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"E.T.外星人E.T.: TheExtra-Terrestrial\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p984732992.jpg\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"ratingNum\": \"180599人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"亨利·托马斯/迪·沃伦斯/罗伯特·麦克纳夫顿\",\n" +
            "        \"type\": \"剧情/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1982\",\n" +
            "        \"ticket\": \"$792.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"碟中谍6：全面瓦解Mission: Impossible-Fallout\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2529365085.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"278905人评价\",\n" +
            "        \"director\": \"克里斯托弗·麦奎里\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/亨利·卡维尔/文·瑞姆斯\",\n" +
            "        \"type\": \"动作/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$791.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"速度与激情6Furious6\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2024579845.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"173969人评价\",\n" +
            "        \"director\": \"林诣彬\",\n" +
            "        \"actor\": \"范·迪塞尔/保罗·沃克/道恩·强森\",\n" +
            "        \"type\": \"动作/犯罪/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$788.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"夺宝奇兵4IndianaJonesandtheKingdomoftheCrystalSkull\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1703349212.jpg\",\n" +
            "        \"score\": \"7.0\",\n" +
            "        \"ratingNum\": \"35373人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"哈里森·福特/希亚·拉博夫/凯特·布兰切特\",\n" +
            "        \"type\": \"动作/冒险/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$786.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蜘蛛侠2Spider-Man2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1617867110.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"138962人评价\",\n" +
            "        \"director\": \"山姆·雷米\",\n" +
            "        \"actor\": \"托比·马奎尔/克斯汀·邓斯特/詹姆斯·弗兰科\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2004\",\n" +
            "        \"ticket\": \"$783.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"死侍Deadpool\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2309264172.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"232277人评价\",\n" +
            "        \"director\": \"蒂姆·米勒\",\n" +
            "        \"actor\": \"瑞恩·雷诺兹/莫蕾娜·巴卡林/艾德·斯克林\",\n" +
            "        \"type\": \"喜剧/动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/加拿大\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$783.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战StarWars\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p732941361.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"74826人评价\",\n" +
            "        \"director\": \"乔治·卢卡斯\",\n" +
            "        \"actor\": \"哈里森·福特/马克·哈米尔/凯丽·费雪\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1977\",\n" +
            "        \"ticket\": \"$775.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"银河护卫队GuardiansoftheGalaxy\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2198455702.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"308928人评价\",\n" +
            "        \"director\": \"詹姆斯·古恩\",\n" +
            "        \"actor\": \"克里斯·帕拉特/佐伊·索尔达娜/布莱德利·库珀\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$773.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"2012\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p505238859.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"331608人评价\",\n" +
            "        \"director\": \"罗兰·艾默里奇\",\n" +
            "        \"actor\": \"约翰·库萨克/切瓦特·埃加福特/阿曼达·皮特\",\n" +
            "        \"type\": \"动作/科幻/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国/加拿大\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$769.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"沉睡魔咒Maleficent\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2185343341.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"132062人评价\",\n" +
            "        \"director\": \"罗伯特·斯特罗姆伯格\",\n" +
            "        \"actor\": \"安吉丽娜·朱莉/艾丽·范宁/沙尔托·科普雷\",\n" +
            "        \"type\": \"动作/爱情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$758.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"达·芬奇密码TheDaVinciCode\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p453938764.jpg\",\n" +
            "        \"score\": \"7.2\",\n" +
            "        \"ratingNum\": \"160586人评价\",\n" +
            "        \"director\": \"朗·霍华德\",\n" +
            "        \"actor\": \"汤姆·汉克斯/奥黛丽·塔图/伊恩·麦克莱恩\",\n" +
            "        \"type\": \"悬疑/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/马耳他/法国/英国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$758.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"超凡蜘蛛侠TheAmazingSpider-Man\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1527315971.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"176290人评价\",\n" +
            "        \"director\": \"马克·韦布\",\n" +
            "        \"actor\": \"安德鲁·加菲尔德/艾玛·斯通/瑞斯·伊凡斯\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$757.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"饥饿游戏3：嘲笑鸟(上)TheHungerGames: Mockingjay-Part1\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2222078042.jpg\",\n" +
            "        \"score\": \"5.9\",\n" +
            "        \"ratingNum\": \"102167人评价\",\n" +
            "        \"director\": \"弗朗西斯·劳伦斯\",\n" +
            "        \"actor\": \"詹妮弗·劳伦斯/乔什·哈切森/利亚姆·海姆斯沃斯\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$755.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"怪物史瑞克4ShrekForeverAfter\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p561405830.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"46090人评价\",\n" +
            "        \"director\": \"迈克·米切尔\",\n" +
            "        \"actor\": \"麦克·梅尔斯/艾迪·墨菲/卡梅隆·迪亚兹\",\n" +
            "        \"type\": \"喜剧/动作/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$752.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"X战警：逆转未来X-Men: DaysofFuturePast\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2181156848.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"295375人评价\",\n" +
            "        \"director\": \"布莱恩·辛格\",\n" +
            "        \"actor\": \"休·杰克曼/詹姆斯·麦卡沃伊/迈克尔·法斯宾德\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$747.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"马达加斯加3Madagascar3: Europe'sMostWanted\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1503869385.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"127108人评价\",\n" +
            "        \"director\": \"康拉德·弗农/埃里克·达尼尔/汤姆·麦格拉思\",\n" +
            "        \"actor\": \"本·斯蒂勒/克里斯·洛克/大卫·休默\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$746.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"自杀小队SuicideSquad\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2363084076.jpg\",\n" +
            "        \"score\": \"6.3\",\n" +
            "        \"ratingNum\": \"133062人评价\",\n" +
            "        \"director\": \"大卫·阿耶\",\n" +
            "        \"actor\": \"威尔·史密斯/杰瑞德·莱托/玛格特·罗比\",\n" +
            "        \"type\": \"动作/犯罪/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$746.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"纳尼亚传奇1：狮子、女巫和魔衣橱TheChroniclesofNarnia: TheLion,theWitchandtheWardrobe\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p815647942.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"118902人评价\",\n" +
            "        \"director\": \"安德鲁·亚当森\",\n" +
            "        \"actor\": \"乔芝·韩莉/斯堪德·凯恩斯/威廉·莫斯里\",\n" +
            "        \"type\": \"剧情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2005\",\n" +
            "        \"ticket\": \"$745.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"怪兽大学MonstersUniversity\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2033476722.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"218060人评价\",\n" +
            "        \"director\": \"丹·斯坎隆\",\n" +
            "        \"actor\": \"比利·克里斯托/约翰·古德曼/史蒂夫·布西密\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$744.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"黑客帝国2：重装上阵TheMatrixReloaded\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p459054512.jpg\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"ratingNum\": \"166395人评价\",\n" +
            "        \"director\": \"莉莉·沃卓斯基/拉娜·沃卓斯基\",\n" +
            "        \"actor\": \"基努·里维斯/凯瑞-安·莫斯/劳伦斯·菲什伯恩\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/澳大利亚\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$742.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"飞屋环游记Up\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2364094053.jpg\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"ratingNum\": \"642013人评价\",\n" +
            "        \"director\": \"彼特·道格特/鲍勃·彼德森\",\n" +
            "        \"actor\": \"爱德华·阿斯纳/克里斯托弗·普卢默/乔丹·长井\",\n" +
            "        \"type\": \"剧情/喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$735.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"死侍2Deadpool2\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2521499639.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"136097人评价\",\n" +
            "        \"director\": \"大卫·雷奇\",\n" +
            "        \"actor\": \"瑞恩·雷诺兹/乔什·布洛林/莫蕾娜·巴卡林\",\n" +
            "        \"type\": \"喜剧/动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$734.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"地心引力Gravity\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2159078612.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"281230人评价\",\n" +
            "        \"director\": \"阿方索·卡隆\",\n" +
            "        \"actor\": \"桑德拉·布洛克/乔治·克鲁尼/艾德·哈里斯\",\n" +
            "        \"type\": \"科幻/惊悚/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$723.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国队长2CaptainAmerica: TheWinterSoldier\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2174824694.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"269930人评价\",\n" +
            "        \"director\": \"安东尼·罗素/乔·罗素\",\n" +
            "        \"actor\": \"克里斯·埃文斯/斯嘉丽·约翰逊/塞巴斯蒂安·斯坦\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$714.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"暮光之城4：破晓(上)TheTwilightSaga: BreakingDawn-Part1\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1296034341.jpg\",\n" +
            "        \"score\": \"6.3\",\n" +
            "        \"ratingNum\": \"97371人评价\",\n" +
            "        \"director\": \"比尔·康顿\",\n" +
            "        \"actor\": \"罗伯特·帕丁森/克里斯汀·斯图尔特/泰勒·洛特纳\",\n" +
            "        \"type\": \"剧情/爱情/惊悚/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$712.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"猩球崛起2：黎明之战DawnofthePlanetoftheApes\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2196211285.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"188102人评价\",\n" +
            "        \"director\": \"马特·里夫斯\",\n" +
            "        \"actor\": \"安迪·瑟金斯/杰森·克拉克/加里·奥德曼\",\n" +
            "        \"type\": \"剧情/动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$710.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"暮光之城2：新月TheTwilightSaga: NewMoon\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p850945243.jpg\",\n" +
            "        \"score\": \"6.5\",\n" +
            "        \"ratingNum\": \"171392人评价\",\n" +
            "        \"director\": \"克里斯·韦兹\",\n" +
            "        \"actor\": \"克里斯汀·斯图尔特/罗伯特·帕丁森/泰勒·洛特纳\",\n" +
            "        \"type\": \"剧情/爱情/惊悚/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$709.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"变形金刚Transformers\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1188042816.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"280445人评价\",\n" +
            "        \"director\": \"迈克尔·贝\",\n" +
            "        \"actor\": \"希亚·拉博夫/泰瑞斯·吉布森/乔什·杜哈明\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$709.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"超凡蜘蛛侠2TheAmazingSpider-Man2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2179858051.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"155040人评价\",\n" +
            "        \"director\": \"马克·韦布\",\n" +
            "        \"actor\": \"安德鲁·加菲尔德/艾玛·斯通/杰米·福克斯\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$709.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小丑回魂It\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2452537144.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"100693人评价\",\n" +
            "        \"director\": \"安德斯·穆斯切蒂\",\n" +
            "        \"actor\": \"比尔·斯卡斯加德/杰顿·李博赫/杰里米·雷·泰勒\",\n" +
            "        \"type\": \"剧情/儿童/恐怖\",\n" +
            "        \"country\": \"制片国家/地区: 美国/加拿大\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$700.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"暮光之城3：月食TheTwilightSaga: Eclipse\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p533676600.jpg\",\n" +
            "        \"score\": \"6.5\",\n" +
            "        \"ratingNum\": \"121947人评价\",\n" +
            "        \"director\": \"大卫·斯雷德\",\n" +
            "        \"actor\": \"克里斯汀·斯图尔特/罗伯特·帕丁森/泰勒·洛特纳\",\n" +
            "        \"type\": \"剧情/爱情/惊悚/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$698.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"碟中谍4Mission: Impossible-GhostProtocol\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1382432968.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"291664人评价\",\n" +
            "        \"director\": \"布拉德·伯德\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/杰瑞米·雷纳/西蒙·佩吉\",\n" +
            "        \"type\": \"动作/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$694.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"饥饿游戏TheHungerGames\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1460591675.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"239165人评价\",\n" +
            "        \"director\": \"盖瑞·罗斯\",\n" +
            "        \"actor\": \"詹妮弗·劳伦斯/乔什·哈切森/利亚姆·海姆斯沃斯\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$694.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"碟中谍5：神秘国度Mission: Impossible-RogueNation\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2263582212.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"213708人评价\",\n" +
            "        \"director\": \"克里斯托弗·麦奎里\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/杰瑞米·雷纳/西蒙·佩吉\",\n" +
            "        \"type\": \"动作/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/香港/中国大陆\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$682.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"阿甘正传ForrestGump\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p510876377.jpg\",\n" +
            "        \"score\": \"9.4\",\n" +
            "        \"ratingNum\": \"966672人评价\",\n" +
            "        \"director\": \"罗伯特·泽米吉斯\",\n" +
            "        \"actor\": \"汤姆·汉克斯/罗宾·怀特/加里·西尼斯\",\n" +
            "        \"type\": \"剧情/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1994\",\n" +
            "        \"ticket\": \"$677.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"奇异博士DoctorStrange\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2388501883.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"332649人评价\",\n" +
            "        \"director\": \"斯科特·德瑞克森\",\n" +
            "        \"actor\": \"本尼迪克特·康伯巴奇/蒂尔达·斯文顿/麦斯·米科尔森\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$677.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星际穿越Interstellar\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2206088801.jpg\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"ratingNum\": \"664566人评价\",\n" +
            "        \"director\": \"克里斯托弗·诺兰\",\n" +
            "        \"actor\": \"马修·麦康纳/安妮·海瑟薇/杰西卡·查斯坦\",\n" +
            "        \"type\": \"剧情/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国/加拿大/冰岛\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$677.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"第六感TheSixthSense\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2220184425.jpg\",\n" +
            "        \"score\": \"8.8\",\n" +
            "        \"ratingNum\": \"283480人评价\",\n" +
            "        \"director\": \"M·奈特·沙马兰\",\n" +
            "        \"actor\": \"布鲁斯·威利斯/海利·乔·奥斯蒙/托妮·科莱特\",\n" +
            "        \"type\": \"剧情/悬疑/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1999\",\n" +
            "        \"ticket\": \"$672.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"超人：钢铁之躯ManofSteel\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1968975252.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"142145人评价\",\n" +
            "        \"director\": \"扎克·施奈德\",\n" +
            "        \"actor\": \"亨利·卡维尔/艾米·亚当斯/迈克尔·珊农\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$668.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"功夫熊猫2KungFuPanda2\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p877183898.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"299588人评价\",\n" +
            "        \"director\": \"吕寅荣\",\n" +
            "        \"actor\": \"杰克·布莱克/安吉丽娜·朱莉/达斯汀·霍夫曼\",\n" +
            "        \"type\": \"喜剧/动作/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$665.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"冰川时代2：融冰之灾IceAge: TheMeltdown\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2204578670.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"155597人评价\",\n" +
            "        \"director\": \"卡洛斯·沙尔丹哈\",\n" +
            "        \"actor\": \"雷·罗马诺/约翰·雷吉扎莫/丹尼斯·利瑞\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$660.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"正义联盟JusticeLeague\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2504027804.jpg\",\n" +
            "        \"score\": \"6.5\",\n" +
            "        \"ratingNum\": \"181728人评价\",\n" +
            "        \"director\": \"扎克·施奈德\",\n" +
            "        \"actor\": \"本·阿弗莱克/亨利·卡维尔/盖尔·加朵\",\n" +
            "        \"type\": \"动作/科幻/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$657.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"超能陆战队BigHero6\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2224568669.jpg\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"ratingNum\": \"460535人评价\",\n" +
            "        \"director\": \"唐·霍尔/克里斯·威廉姆斯\",\n" +
            "        \"actor\": \"斯科特·安第斯/瑞恩·波特/丹尼尔·海尼\",\n" +
            "        \"type\": \"喜剧/动作/科幻/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$657.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"加勒比海盗PiratesoftheCaribbean: TheCurseoftheBlackPearl\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1596085504.jpg\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"ratingNum\": \"432065人评价\",\n" +
            "        \"director\": \"戈尔·维宾斯基\",\n" +
            "        \"actor\": \"约翰尼·德普/杰弗里·拉什/奥兰多·布鲁姆\",\n" +
            "        \"type\": \"动作/冒险/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$654.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"饥饿游戏3：嘲笑鸟(下)TheHungerGames: Mockingjay-Part2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2282434035.jpg\",\n" +
            "        \"score\": \"6.2\",\n" +
            "        \"ratingNum\": \"75093人评价\",\n" +
            "        \"director\": \"弗朗西斯·劳伦斯\",\n" +
            "        \"actor\": \"詹妮弗·劳伦斯/乔什·哈切森/利亚姆·海姆斯沃斯\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$653.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战前传2：克隆人的进攻StarWars: EpisodeII-AttackoftheClones\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2308393297.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"59303人评价\",\n" +
            "        \"director\": \"乔治·卢卡斯\",\n" +
            "        \"actor\": \"伊万·麦克格雷格/娜塔莉·波特曼/海登·克里斯滕森\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2002\",\n" +
            "        \"ticket\": \"$649.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神2：黑暗世界Thor: TheDarkWorld\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2156839164.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"188360人评价\",\n" +
            "        \"director\": \"阿兰·泰勒\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯/娜塔莉·波特曼/汤姆·希德勒斯顿\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$644.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"海洋奇缘Moana\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2397960879.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"88216人评价\",\n" +
            "        \"director\": \"罗恩·克莱蒙兹/约翰·马斯克/唐·霍尔/克里斯·威廉姆斯\",\n" +
            "        \"actor\": \"奥丽伊·卡瓦洛/道恩·强森/瑞切尔·豪斯\",\n" +
            "        \"type\": \"动画/奇幻/冒险/歌舞\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$643.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"欢乐好声音Sing\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2411622136.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"153339人评价\",\n" +
            "        \"director\": \"加斯·詹宁斯/克里斯托夫·卢尔德莱\",\n" +
            "        \"actor\": \"马修·麦康纳/瑞茜·威瑟斯彭/塞思·麦克法兰\",\n" +
            "        \"type\": \"喜剧/动画/歌舞\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$634.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"超人总动员TheIncredibles\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2167017148.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"170403人评价\",\n" +
            "        \"director\": \"布拉德·伯德\",\n" +
            "        \"actor\": \"格雷格·T·尼尔森/霍利·亨特/塞缪尔·杰克逊\",\n" +
            "        \"type\": \"喜剧/动作/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2004\",\n" +
            "        \"ticket\": \"$633.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"功夫熊猫KungFuPanda\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1597238857.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"345568人评价\",\n" +
            "        \"director\": \"马克·奥斯本/约翰·斯蒂文森\",\n" +
            "        \"actor\": \"杰克·布莱克/达斯汀·霍夫曼/安吉丽娜·朱莉\",\n" +
            "        \"type\": \"喜剧/动作/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$631.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"火星救援TheMartian\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2280097442.jpg\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"ratingNum\": \"355013人评价\",\n" +
            "        \"director\": \"雷德利·斯科特\",\n" +
            "        \"actor\": \"马特·达蒙/杰西卡·查斯坦/克里斯汀·韦格\",\n" +
            "        \"type\": \"剧情/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$630.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"速度与激情5FastFive\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p898634801.jpg\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"ratingNum\": \"234103人评价\",\n" +
            "        \"director\": \"林诣彬\",\n" +
            "        \"actor\": \"范·迪塞尔/保罗·沃克/道恩·强森\",\n" +
            "        \"type\": \"动作/犯罪\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$626.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"全民超人汉考克Hancock\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1133205431.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"134742人评价\",\n" +
            "        \"director\": \"彼得·博格\",\n" +
            "        \"actor\": \"威尔·史密斯/查理兹·塞隆/杰森·贝特曼\",\n" +
            "        \"type\": \"动作/犯罪/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$624.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"黑衣人3MeninBlackIII\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1731774258.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"196635人评价\",\n" +
            "        \"director\": \"巴里·索南菲尔德\",\n" +
            "        \"actor\": \"威尔·史密斯/汤米·李·琼斯/乔什·布洛林\",\n" +
            "        \"type\": \"动作/喜剧/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$624.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠2IronMan2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p452861346.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"220819人评价\",\n" +
            "        \"director\": \"乔恩·费儒\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/格温妮斯·帕特洛/米基·洛克\",\n" +
            "        \"type\": \"动作/冒险/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$623.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蚁人2：黄蜂女现身Ant-ManandtheWasp\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2529389608.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"223371人评价\",\n" +
            "        \"director\": \"佩顿·里德\",\n" +
            "        \"actor\": \"保罗·路德/伊万杰琳·莉莉/迈克尔·佩纳\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$622.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"驯龙高手2HowtoTrainYourDragon2\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2192713707.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"153667人评价\",\n" +
            "        \"director\": \"迪恩·德布洛斯\",\n" +
            "        \"actor\": \"杰伊·巴鲁切尔/凯特·布兰切特/杰拉德·巴特勒\",\n" +
            "        \"type\": \"喜剧/动画/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$621.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美食总动员Ratatouille\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p465604496.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"203745人评价\",\n" +
            "        \"director\": \"布拉德·伯德/简·皮克瓦\",\n" +
            "        \"actor\": \"帕顿·奥斯瓦尔特/彼得·奥图尔/布拉德·加内特\",\n" +
            "        \"type\": \"喜剧/动画/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$620.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"金刚狼3：殊死一战Logan\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2431980130.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"283507人评价\",\n" +
            "        \"director\": \"詹姆斯·曼高德\",\n" +
            "        \"actor\": \"休·杰克曼/帕特里克·斯图尔特/达芙妮·基恩\",\n" +
            "        \"type\": \"剧情/动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$619.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"侏罗纪公园2：失落的世界TheLostWorld: JurassicPark\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1259571118.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"83621人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"杰夫·高布伦/朱丽安·摩尔/皮特·波斯尔思韦特\",\n" +
            "        \"type\": \"动作/冒险/科幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1997\",\n" +
            "        \"ticket\": \"$618.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"耶稣受难记ThePassionoftheChrist\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1751985900.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"25311人评价\",\n" +
            "        \"director\": \"梅尔·吉布森\",\n" +
            "        \"actor\": \"吉姆·卡维泽/玛雅·摩根斯特恩/克里斯托·日夫科夫\",\n" +
            "        \"type\": \"剧情\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2004\",\n" +
            "        \"ticket\": \"$611.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"妈妈咪呀MammaMia!\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p705031957.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"56019人评价\",\n" +
            "        \"director\": \"菲利达·劳埃德\",\n" +
            "        \"actor\": \"梅丽尔·斯特里普/阿曼达·塞弗里德/皮尔斯·布鲁斯南\",\n" +
            "        \"type\": \"喜剧/歌舞/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国/德国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$609.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"少年派的奇幻漂流LifeofPi\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1784592701.jpg\",\n" +
            "        \"score\": \"9.0\",\n" +
            "        \"ratingNum\": \"727690人评价\",\n" +
            "        \"director\": \"李安\",\n" +
            "        \"actor\": \"苏拉·沙玛/伊尔凡·可汗/拉菲·斯波\",\n" +
            "        \"type\": \"剧情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/台湾/英国/加拿大\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$609.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"变形金刚5：最后的骑士Transformers: TheLastKnight\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2462475058.jpg\",\n" +
            "        \"score\": \"4.9\",\n" +
            "        \"ratingNum\": \"157226人评价\",\n" +
            "        \"director\": \"迈克尔·贝\",\n" +
            "        \"actor\": \"马克·沃尔伯格/伊莎贝拉·莫奈/劳拉·哈德克\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$605.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"马达加斯加2：逃往非洲Madagascar: Escape2Africa\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2220723383.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"83527人评价\",\n" +
            "        \"director\": \"埃里克·达尼尔/汤姆·麦格拉思\",\n" +
            "        \"actor\": \"本·斯蒂勒/克里斯·洛克/大卫·休默\",\n" +
            "        \"type\": \"动画/动作/冒险/喜剧/家庭\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$603.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"007：大战皇家赌场CasinoRoyale\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p790087797.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"103911人评价\",\n" +
            "        \"director\": \"马丁·坎贝尔\",\n" +
            "        \"actor\": \"丹尼尔·克雷格/伊娃·格林/麦斯·米科尔森\",\n" +
            "        \"type\": \"动作/惊悚/犯罪\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国/德国/捷克CzechRepublic/巴哈马Bahamas\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$599.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"魔发奇缘Tangled\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p707509468.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"137752人评价\",\n" +
            "        \"director\": \"内森·格雷诺/拜伦·霍华德\",\n" +
            "        \"actor\": \"曼迪·摩尔/扎克瑞·莱维/唐纳·墨菲\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$591.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"世界之战WaroftheWorlds\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2243507786.jpg\",\n" +
            "        \"score\": \"6.5\",\n" +
            "        \"ratingNum\": \"52003人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/达科塔·范宁/米兰达·奥图\",\n" +
            "        \"type\": \"科幻/惊悚/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2005\",\n" +
            "        \"ticket\": \"$591.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"黑衣人MeninBlack\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p453512941.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"177768人评价\",\n" +
            "        \"director\": \"巴里·索南菲尔德\",\n" +
            "        \"actor\": \"威尔·史密斯/汤米·李·琼斯/琳达·费奥伦蒂诺\",\n" +
            "        \"type\": \"动作/喜剧/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1997\",\n" +
            "        \"ticket\": \"$589.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"疯狂原始人TheCroods\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1867084027.jpg\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"ratingNum\": \"440643人评价\",\n" +
            "        \"director\": \"柯克·德·米科/克里斯·桑德斯\",\n" +
            "        \"actor\": \"尼古拉斯·凯奇/艾玛·斯通/瑞恩·雷诺兹\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$587.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"宿醉2TheHangoverPartII\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1016132295.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"87741人评价\",\n" +
            "        \"director\": \"托德·菲利普斯\",\n" +
            "        \"actor\": \"布莱德利·库珀/扎克·加利凡纳基斯/艾德·赫尔姆斯\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$586.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"007：大破量子危机QuantumofSolace\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p976999859.jpg\",\n" +
            "        \"score\": \"6.5\",\n" +
            "        \"ratingNum\": \"73100人评价\",\n" +
            "        \"director\": \"马克·福斯特\",\n" +
            "        \"actor\": \"丹尼尔·克雷格/朱迪·丹奇/欧嘉·柯瑞兰寇\",\n" +
            "        \"type\": \"动作/冒险/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$586.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"我是传奇IAmLegend\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p574158935.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"229759人评价\",\n" +
            "        \"director\": \"弗朗西斯·劳伦斯\",\n" +
            "        \"actor\": \"威尔·史密斯/艾莉丝·布拉加/CharlieTahan\",\n" +
            "        \"type\": \"剧情/科幻/恐怖\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$585.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"钢铁侠IronMan\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p725871004.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"289521人评价\",\n" +
            "        \"director\": \"乔恩·费儒\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/泰伦斯·霍华德/格温妮斯·帕特洛\",\n" +
            "        \"type\": \"动作/冒险/科幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$585.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"头号玩家ReadyPlayerOne\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2516578307.jpg\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"ratingNum\": \"594589人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"泰伊·谢里丹/奥利维亚·库克/本·门德尔森\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$582.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"红海行动\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2514119443.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"517103人评价\",\n" +
            "        \"director\": \"林超贤\",\n" +
            "        \"actor\": \"张译/黄景瑜/海清\",\n" +
            "        \"type\": \"动作/战争\",\n" +
            "        \"country\": \"制片国家/地区: 中国大陆/香港\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$579.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"怪兽电力公司Monsters,Inc.\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2513247938.jpg\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"ratingNum\": \"301170人评价\",\n" +
            "        \"director\": \"彼特·道格特/大卫·斯沃曼/李·昂克里奇\",\n" +
            "        \"actor\": \"约翰·古德曼/比利·克里斯托/玛丽·吉布斯\",\n" +
            "        \"type\": \"儿童/喜剧/动画/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2001\",\n" +
            "        \"ticket\": \"$577.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"博物馆奇妙夜NightattheMuseum\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2155462073.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"162078人评价\",\n" +
            "        \"director\": \"肖恩·利维\",\n" +
            "        \"actor\": \"本·斯蒂勒/欧文·威尔逊/罗宾·威廉姆斯\",\n" +
            "        \"type\": \"动作/冒险/喜剧/家庭/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$574.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"金刚：骷髅岛Kong: SkullIsland\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2436030518.jpg\",\n" +
            "        \"score\": \"6.6\",\n" +
            "        \"ratingNum\": \"147572人评价\",\n" +
            "        \"director\": \"乔丹·沃格特-罗伯茨\",\n" +
            "        \"actor\": \"汤姆·希德勒斯顿/布丽·拉尔森/塞缪尔·杰克逊\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆/澳大利亚/加拿大\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$566.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蓝精灵TheSmurfs\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p884990120.jpg\",\n" +
            "        \"score\": \"7.2\",\n" +
            "        \"ratingNum\": \"85739人评价\",\n" +
            "        \"director\": \"拉加·高斯内尔\",\n" +
            "        \"actor\": \"尼尔·帕特里克·哈里斯/杰玛·梅斯/汉克·阿扎利亚\",\n" +
            "        \"type\": \"喜剧/动画/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/比利时\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$563.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"赛车总动员2Cars2\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p960984759.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"55264人评价\",\n" +
            "        \"director\": \"约翰·拉塞特/布拉德·刘易斯\",\n" +
            "        \"actor\": \"欧文·威尔逊/王牌接线员拉里/迈克尔·凯恩\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$562.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"穿靴子的猫PussinBoots\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1210700530.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"92254人评价\",\n" +
            "        \"director\": \"克里斯·米勒\",\n" +
            "        \"actor\": \"安东尼奥·班德拉斯/萨尔玛·海耶克/扎克·加利凡纳基斯\",\n" +
            "        \"type\": \"冒险/动画/喜剧/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$555.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美人鱼\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2316177058.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"ratingNum\": \"473020人评价\",\n" +
            "        \"director\": \"周星驰\",\n" +
            "        \"actor\": \"邓超/罗志祥/张雨绮\",\n" +
            "        \"type\": \"喜剧/爱情/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 中国大陆/香港\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$553.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"世界末日Armageddon\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p686635022.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"46131人评价\",\n" +
            "        \"director\": \"迈克尔·贝\",\n" +
            "        \"actor\": \"布鲁斯·威利斯/本·阿弗莱克/丽芙·泰勒\",\n" +
            "        \"type\": \"动作/科幻/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1998\",\n" +
            "        \"ticket\": \"$553.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"金刚KingKong\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p858079649.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"194961人评价\",\n" +
            "        \"director\": \"彼得·杰克逊\",\n" +
            "        \"actor\": \"娜奥米·沃茨/杰克·布莱克/艾德里安·布洛迪\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 新西兰/美国/德国\",\n" +
            "        \"year\": \"2005\",\n" +
            "        \"ticket\": \"$550.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"泰迪熊Ted\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1588315198.jpg\",\n" +
            "        \"score\": \"7.0\",\n" +
            "        \"ratingNum\": \"208528人评价\",\n" +
            "        \"director\": \"塞思·麦克法兰\",\n" +
            "        \"actor\": \"塞思·麦克法兰/马克·沃尔伯格/米拉·库尼斯\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$549.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美国狙击手AmericanSniper\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2203481530.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"66952人评价\",\n" +
            "        \"director\": \"克林特·伊斯特伍德\",\n" +
            "        \"actor\": \"布莱德利·库珀/西耶娜·米勒/凯尔·加尔纳\",\n" +
            "        \"type\": \"传记/动作/战争\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$547.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"碟中谍2Mission: ImpossibleII\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1355956258.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"105466人评价\",\n" +
            "        \"director\": \"吴宇森\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/多格雷·斯科特/坦迪·牛顿\",\n" +
            "        \"type\": \"动作/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/德国\",\n" +
            "        \"year\": \"2000\",\n" +
            "        \"ticket\": \"$546.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"大侦探福尔摩斯2：诡影游戏SherlockHolmes: AGameofShadows\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1327387815.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"157445人评价\",\n" +
            "        \"director\": \"盖·里奇\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/裘德·洛/瑞秋·麦克亚当斯\",\n" +
            "        \"type\": \"动作/犯罪/悬疑/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$545.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"后天TheDayAfterTomorrow\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2209602029.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"248698人评价\",\n" +
            "        \"director\": \"罗兰·艾默里奇\",\n" +
            "        \"actor\": \"丹尼斯·奎德/杰克·吉伦哈尔/埃米·罗森\",\n" +
            "        \"type\": \"动作/科幻/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2004\",\n" +
            "        \"ticket\": \"$544.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"唐人街探案2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2511355624.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"ratingNum\": \"462581人评价\",\n" +
            "        \"director\": \"陈思诚\",\n" +
            "        \"actor\": \"王宝强/刘昊然/肖央\",\n" +
            "        \"type\": \"喜剧/动作/犯罪/悬疑\",\n" +
            "        \"country\": \"制片国家/地区: 中国大陆\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$544.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"X战警：天启X-Men: Apocalypse\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2352321614.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"238346人评价\",\n" +
            "        \"director\": \"布莱恩·辛格\",\n" +
            "        \"actor\": \"詹姆斯·麦卡沃伊/迈克尔·法斯宾德/詹妮弗·劳伦斯\",\n" +
            "        \"type\": \"动作/科幻/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$543.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"灰姑娘Cinderella\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2231066272.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"135854人评价\",\n" +
            "        \"director\": \"肯尼思·布拉纳\",\n" +
            "        \"actor\": \"莉莉·詹姆斯/理查德·麦登/凯特·布兰切特\",\n" +
            "        \"type\": \"爱情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$543.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"神偷奶爸DespicableMe\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p792776858.jpg\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"ratingNum\": \"472559人评价\",\n" +
            "        \"director\": \"皮埃尔·柯芬/克里斯·雷纳德\",\n" +
            "        \"actor\": \"史蒂夫·卡瑞尔/杰森·席格尔/拉塞尔·布兰德\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/法国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$543.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"勇敢传说Brave\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1569455435.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"99909人评价\",\n" +
            "        \"director\": \"马克∙安德鲁斯/布兰达∙查普曼/史蒂夫·普切尔\",\n" +
            "        \"actor\": \"凯莉·麦克唐纳/艾玛·汤普森/比利·康诺利\",\n" +
            "        \"type\": \"喜剧/动画/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$540.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"僵尸世界大战WorldWarZ\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1915547683.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"143911人评价\",\n" +
            "        \"director\": \"马克·福斯特\",\n" +
            "        \"actor\": \"布拉德·皮特/米瑞·伊诺丝/马修·福克斯\",\n" +
            "        \"type\": \"动作/科幻/恐怖\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$540.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战2：帝国反击战StarWars: EpisodeV-TheEmpireStrikesBack\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p732937546.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"57820人评价\",\n" +
            "        \"director\": \"厄文·克什纳\",\n" +
            "        \"actor\": \"马克·哈米尔/哈里森·福特/凯丽·费雪\",\n" +
            "        \"type\": \"动作/冒险/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1980\",\n" +
            "        \"ticket\": \"$538.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"机器人总动员WALL·E\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1461851991.jpg\",\n" +
            "        \"score\": \"9.3\",\n" +
            "        \"ratingNum\": \"651664人评价\",\n" +
            "        \"director\": \"安德鲁·斯坦顿\",\n" +
            "        \"actor\": \"本·贝尔特/艾丽莎·奈特/杰夫·格尔林\",\n" +
            "        \"type\": \"爱情/科幻/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$533.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"荒野猎人TheRevenant\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2323258429.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"242451人评价\",\n" +
            "        \"director\": \"亚利桑德罗·冈萨雷斯·伊纳里图\",\n" +
            "        \"actor\": \"莱昂纳多·迪卡普里奥/汤姆·哈迪/多姆纳尔·格里森\",\n" +
            "        \"type\": \"剧情/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$533.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"马达加斯加Madagascar\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1971268235.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"129921人评价\",\n" +
            "        \"director\": \"埃里克·达尼尔/汤姆·麦格拉思\",\n" +
            "        \"actor\": \"本·斯蒂勒/克里斯·洛克/大卫·休默\",\n" +
            "        \"type\": \"动画/冒险/喜剧/家庭\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2005\",\n" +
            "        \"ticket\": \"$532.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哥斯拉Godzilla\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2185227574.jpg\",\n" +
            "        \"score\": \"6.4\",\n" +
            "        \"ratingNum\": \"115570人评价\",\n" +
            "        \"director\": \"加里斯·爱德华斯\",\n" +
            "        \"actor\": \"亚伦·泰勒-约翰逊/卡梅隆·CJ·亚当斯/渡边谦\",\n" +
            "        \"type\": \"动作/科幻/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国/日本\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$529.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"宝贝老板TheBossBaby\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2407336615.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"34551人评价\",\n" +
            "        \"director\": \"汤姆·麦格拉思\",\n" +
            "        \"actor\": \"亚历克·鲍德温/迈尔斯·克里斯托弗·巴克什/吉米·坎摩尔\",\n" +
            "        \"type\": \"喜剧/动画\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$528.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"巨齿鲨TheMeg\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2530572643.jpg\",\n" +
            "        \"score\": \"5.8\",\n" +
            "        \"ratingNum\": \"120794人评价\",\n" +
            "        \"director\": \"乔·德特杜巴\",\n" +
            "        \"actor\": \"杰森·斯坦森/李冰冰/雷恩·威尔森\",\n" +
            "        \"type\": \"动作/科幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆/香港\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$527.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"敦刻尔克Dunkirk\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2494950714.jpg\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"ratingNum\": \"394269人评价\",\n" +
            "        \"director\": \"克里斯托弗·诺兰\",\n" +
            "        \"actor\": \"菲恩·怀特海德/汤姆·格林-卡尼/杰克·劳登\",\n" +
            "        \"type\": \"剧情/历史/战争\",\n" +
            "        \"country\": \"制片国家/地区: 英国/法国/美国/荷兰\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$527.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"辛普森一家TheSimpsonsMovie\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1947152148.jpg\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"ratingNum\": \"65675人评价\",\n" +
            "        \"director\": \"大卫·斯沃曼\",\n" +
            "        \"actor\": \"丹·卡斯泰兰尼塔/朱莉·卡夫娜/南茜·卡特莱特\",\n" +
            "        \"type\": \"动画/冒险/喜剧\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$527.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"精灵旅社3：疯狂假期HotelTransylvania3: SummerVacation\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2530591543.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"ratingNum\": \"54668人评价\",\n" +
            "        \"director\": \"格恩迪·塔塔科夫斯基\",\n" +
            "        \"actor\": \"亚当·桑德勒/凯瑟琳·哈恩/史蒂夫·布西密\",\n" +
            "        \"type\": \"喜剧/动画/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$525.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"大侦探福尔摩斯SherlockHolmes\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1078047854.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"213024人评价\",\n" +
            "        \"director\": \"盖·里奇\",\n" +
            "        \"actor\": \"小罗伯特·唐尼/裘德·洛/瑞秋·麦克亚当斯\",\n" +
            "        \"type\": \"动作/冒险/犯罪/悬疑/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/德国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$524.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"功夫熊猫3KungFuPanda3\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2306653420.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"208730人评价\",\n" +
            "        \"director\": \"吕寅荣/亚历山德罗·卡罗尼\",\n" +
            "        \"actor\": \"杰克·布莱克/布莱恩·科兰斯顿/达斯汀·霍夫曼\",\n" +
            "        \"type\": \"喜剧/动作/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$521.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"终结者2：审判日Terminator2: JudgmentDay\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1910909085.jpg\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"ratingNum\": \"166233人评价\",\n" +
            "        \"director\": \"詹姆斯·卡梅隆\",\n" +
            "        \"actor\": \"阿诺·施瓦辛格/琳达·汉密尔顿/爱德华·福隆\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/法国\",\n" +
            "        \"year\": \"1991\",\n" +
            "        \"ticket\": \"$520.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蚁人Ant-Man\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2266823371.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"264685人评价\",\n" +
            "        \"director\": \"佩顿·里德\",\n" +
            "        \"actor\": \"保罗·路德/迈克尔·道格拉斯/伊万杰琳·莉莉\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$519.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"拜见岳父大人2MeettheFockers\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p635968845.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"24741人评价\",\n" +
            "        \"director\": \"杰伊·罗奇\",\n" +
            "        \"actor\": \"本·斯蒂勒/罗伯特·德尼罗/达斯汀·霍夫曼\",\n" +
            "        \"type\": \"喜剧/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2004\",\n" +
            "        \"ticket\": \"$516.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"人鬼情未了Ghost\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p544574893.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"149866人评价\",\n" +
            "        \"director\": \"杰瑞·扎克\",\n" +
            "        \"actor\": \"帕特里克·斯威兹/黛米·摩尔/托尼·戈德温\",\n" +
            "        \"type\": \"剧情/爱情/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1990\",\n" +
            "        \"ticket\": \"$505.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"阿拉丁Aladdin\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1833285442.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"42022人评价\",\n" +
            "        \"director\": \"罗恩·克莱蒙兹/约翰·马斯克\",\n" +
            "        \"actor\": \"斯科特·维内尔/罗宾·威廉姆斯/琳达·拉金\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1992\",\n" +
            "        \"ticket\": \"$504.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"里约大冒险2Rio2\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2177142678.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"87593人评价\",\n" +
            "        \"director\": \"卡洛斯·沙尔丹哈\",\n" +
            "        \"actor\": \"安妮·海瑟薇/杰西·艾森伯格/布鲁诺·马尔斯\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$500.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"特洛伊Troy\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p727373711.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"98837人评价\",\n" +
            "        \"director\": \"沃尔夫冈·彼德森\",\n" +
            "        \"actor\": \"布拉德·皮特/黛安·克鲁格/奥兰多·布鲁姆\",\n" +
            "        \"type\": \"动作/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 美国/马耳他/英国\",\n" +
            "        \"year\": \"2004\",\n" +
            "        \"ticket\": \"$497.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"玩具总动员2ToyStory2\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1283688673.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"97659人评价\",\n" +
            "        \"director\": \"约翰·拉塞特/艾什·布兰农/李·昂克里奇\",\n" +
            "        \"actor\": \"汤姆·汉克斯/蒂姆·艾伦/琼·库萨克\",\n" +
            "        \"type\": \"喜剧/动画/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1999\",\n" +
            "        \"ticket\": \"$497.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"驯龙高手HowtoTrainYourDragon\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p490385643.jpg\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"ratingNum\": \"350545人评价\",\n" +
            "        \"director\": \"迪恩·德布洛斯/克里斯·桑德斯\",\n" +
            "        \"actor\": \"杰伊·巴鲁切尔/杰拉德·巴特勒/克雷格·费格森\",\n" +
            "        \"type\": \"喜剧/动画/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$494.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"龙卷风Twister\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1111200030.jpg\",\n" +
            "        \"score\": \"7.2\",\n" +
            "        \"ratingNum\": \"21677人评价\",\n" +
            "        \"director\": \"扬·德·邦特\",\n" +
            "        \"actor\": \"海伦·亨特/比尔·帕克斯顿/加利·艾尔维斯\",\n" +
            "        \"type\": \"动作/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1996\",\n" +
            "        \"ticket\": \"$494.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"忍者神龟：变种时代TeenageMutantNinjaTurtles\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2204991581.jpg\",\n" +
            "        \"score\": \"6.4\",\n" +
            "        \"ratingNum\": \"86359人评价\",\n" +
            "        \"director\": \"乔纳森·里贝斯曼\",\n" +
            "        \"actor\": \"梅根·福克斯/威尔·阿奈特/威廉·菲德内尔\",\n" +
            "        \"type\": \"喜剧/动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$493.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"魔境仙踪Oz: TheGreatandPowerful\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1776534018.jpg\",\n" +
            "        \"score\": \"6.3\",\n" +
            "        \"ratingNum\": \"41702人评价\",\n" +
            "        \"director\": \"山姆·雷米\",\n" +
            "        \"actor\": \"詹姆斯·弗兰科/米歇尔·威廉姆斯/蕾切尔·薇兹\",\n" +
            "        \"type\": \"奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$493.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"诸神之战ClashoftheTitans\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p443378368.jpg\",\n" +
            "        \"score\": \"6.0\",\n" +
            "        \"ratingNum\": \"78203人评价\",\n" +
            "        \"director\": \"路易斯·莱特里尔\",\n" +
            "        \"actor\": \"萨姆·沃辛顿/杰玛·阿特登/麦斯·米科尔森\",\n" +
            "        \"type\": \"动作/冒险/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$493.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"猩球崛起3：终极之战WarforthePlanetoftheApes\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2494096554.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"142054人评价\",\n" +
            "        \"director\": \"马特·里夫斯\",\n" +
            "        \"actor\": \"安迪·瑟金斯/伍迪·哈里森/史蒂夫·茨恩\",\n" +
            "        \"type\": \"剧情/动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$490.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"波西米亚狂想曲BohemianRhapsody\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2522138824.jpg\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"ratingNum\": \"5734人评价\",\n" +
            "        \"director\": \"布莱恩·辛格\",\n" +
            "        \"actor\": \"拉米·马雷克/本·哈迪/约瑟夫·梅泽罗\",\n" +
            "        \"type\": \"剧情/传记/音乐\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$487.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"天使与魔鬼Angels&Demons\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p786228964.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"80484人评价\",\n" +
            "        \"director\": \"朗·霍华德\",\n" +
            "        \"actor\": \"汤姆·汉克斯/伊万·麦克格雷格/阿耶莱特·祖里尔\",\n" +
            "        \"type\": \"悬疑/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/意大利\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$485.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"里约大冒险Rio\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2170811687.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"237963人评价\",\n" +
            "        \"director\": \"卡洛斯·沙尔丹哈\",\n" +
            "        \"actor\": \"杰西·艾森伯格/安妮·海瑟薇/乔治·洛佩兹\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$484.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"冒牌天神BruceAlmighty\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2165714151.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"136706人评价\",\n" +
            "        \"director\": \"汤姆·沙迪亚克\",\n" +
            "        \"actor\": \"金·凯瑞/摩根·弗里曼/詹妮弗·安妮斯顿\",\n" +
            "        \"type\": \"喜剧/剧情/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$484.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"怪物史瑞克Shrek\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1910896706.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"133190人评价\",\n" +
            "        \"director\": \"安德鲁·亚当森/维基·詹森\",\n" +
            "        \"actor\": \"麦克·梅尔斯/艾迪·墨菲/卡梅隆·迪亚兹\",\n" +
            "        \"type\": \"动画/冒险/喜剧/家庭/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2001\",\n" +
            "        \"ticket\": \"$484.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"拯救大兵瑞恩SavingPrivateRyan\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1014542496.jpg\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"ratingNum\": \"305019人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"汤姆·汉克斯/汤姆·塞兹摩尔/爱德华·伯恩斯\",\n" +
            "        \"type\": \"剧情/历史/战争\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1998\",\n" +
            "        \"ticket\": \"$481.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"猩球崛起RiseofthePlanetoftheApes\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1281402537.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"279889人评价\",\n" +
            "        \"director\": \"鲁伯特·瓦耶特\",\n" +
            "        \"actor\": \"詹姆斯·弗兰科/安迪·瑟金斯/汤姆·费尔顿\",\n" +
            "        \"type\": \"剧情/动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$481.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"史密斯夫妇Mr.&Mrs.Smith\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1677402144.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"290137人评价\",\n" +
            "        \"director\": \"道格·里曼\",\n" +
            "        \"actor\": \"布拉德·皮特/安吉丽娜·朱莉/文斯·沃恩\",\n" +
            "        \"type\": \"喜剧/动作/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2005\",\n" +
            "        \"ticket\": \"$478.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"小鬼当家HomeAlone\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1529668801.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"221321人评价\",\n" +
            "        \"director\": \"克里斯·哥伦布\",\n" +
            "        \"actor\": \"麦考利·卡尔金/乔·佩西/丹尼尔·斯特恩\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1990\",\n" +
            "        \"ticket\": \"$476.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星球大战3：绝地归来StarWars: EpisodeVI-ReturnoftheJedi\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p732934345.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"53358人评价\",\n" +
            "        \"director\": \"理查德·马昆德\",\n" +
            "        \"actor\": \"马克·哈米尔/哈里森·福特/安东尼·丹尼尔斯\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1983\",\n" +
            "        \"ticket\": \"$475.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"查理和巧克力工厂CharlieandtheChocolateFactory\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p453925617.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"248996人评价\",\n" +
            "        \"director\": \"蒂姆·波顿\",\n" +
            "        \"actor\": \"约翰尼·德普/弗莱迪·海默/海伦娜·伯翰·卡特\",\n" +
            "        \"type\": \"冒险/喜剧/家庭/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国/澳大利亚\",\n" +
            "        \"year\": \"2005\",\n" +
            "        \"ticket\": \"$475.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"精灵旅社2HotelTransylvania2\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2276842218.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"80074人评价\",\n" +
            "        \"director\": \"格恩迪·塔塔科夫斯基\",\n" +
            "        \"actor\": \"亚当·桑德勒/安迪·萨姆伯格/赛琳娜·戈麦斯\",\n" +
            "        \"type\": \"喜剧/动画/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$474.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"夺宝奇兵3IndianaJonesandtheLastCrusade\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1703183716.jpg\",\n" +
            "        \"score\": \"8.2\",\n" +
            "        \"ratingNum\": \"39041人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"哈里森·福特/肖恩·康纳利/丹霍姆·艾略特\",\n" +
            "        \"type\": \"动作/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1989\",\n" +
            "        \"ticket\": \"$474.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"末日崩塌SanAndreas\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2247341513.jpg\",\n" +
            "        \"score\": \"7.0\",\n" +
            "        \"ratingNum\": \"104704人评价\",\n" +
            "        \"director\": \"布拉德·佩顿\",\n" +
            "        \"actor\": \"道恩·强森/亚历珊德拉·达达里奥/卡拉·古奇诺\",\n" +
            "        \"type\": \"动作/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国/澳大利亚\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$474.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"无敌破坏王Wreck-ItRalph\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1735642656.jpg\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"ratingNum\": \"242291人评价\",\n" +
            "        \"director\": \"瑞奇·摩尔\",\n" +
            "        \"actor\": \"约翰·C·赖利/萨拉·西尔弗曼/杰克·麦克布瑞尔\",\n" +
            "        \"type\": \"喜剧/动画/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$471.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"大白鲨Jaws\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2189845463.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"55011人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"罗伊·沙伊德尔/罗伯特·肖/理查德·德莱弗斯\",\n" +
            "        \"type\": \"剧情/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1975\",\n" +
            "        \"ticket\": \"$470.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"神奇动物：格林德沃之罪FantasticBeasts: TheCrimesofGrindelwald\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2539424621.jpg\",\n" +
            "        \"score\": \"7.2\",\n" +
            "        \"ratingNum\": \"177348人评价\",\n" +
            "        \"director\": \"大卫·叶茨\",\n" +
            "        \"actor\": \"埃迪·雷德梅恩/凯瑟琳·沃特斯顿/约翰尼·德普\",\n" +
            "        \"type\": \"奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$470.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"乐高大电影TheLegoMovie\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2158676090.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"41436人评价\",\n" +
            "        \"director\": \"菲尔·罗德/克里斯托弗·米勒\",\n" +
            "        \"actor\": \"克里斯·帕拉特/威尔·法瑞尔/伊丽莎白·班克斯\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/澳大利亚/丹麦\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$469.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"宿醉TheHangover\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p455238724.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"172127人评价\",\n" +
            "        \"director\": \"托德·菲利普斯\",\n" +
            "        \"actor\": \"布莱德利·库珀/艾德·赫尔姆斯/扎克·加利凡纳基斯\",\n" +
            "        \"type\": \"喜剧\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$467.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星际迷航2：暗黑无界StarTrekIntoDarkness\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1907669506.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"162115人评价\",\n" +
            "        \"director\": \"J·J·艾布拉姆斯\",\n" +
            "        \"actor\": \"克里斯·派恩/扎克瑞·昆图/佐伊·索尔达娜\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$467.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"黑客帝国TheMatrix\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p451926968.jpg\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"ratingNum\": \"356777人评价\",\n" +
            "        \"director\": \"莉莉·沃卓斯基/拉娜·沃卓斯基\",\n" +
            "        \"actor\": \"基努·里维斯/凯瑞-安·莫斯/劳伦斯·菲什伯恩\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/澳大利亚\",\n" +
            "        \"year\": \"1999\",\n" +
            "        \"ticket\": \"$463.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"漂亮女人PrettyWoman\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2199988222.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"95494人评价\",\n" +
            "        \"director\": \"盖瑞·马歇尔\",\n" +
            "        \"actor\": \"理查·基尔/朱莉娅·罗伯茨/拉尔夫·贝拉米\",\n" +
            "        \"type\": \"喜剧/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1990\",\n" +
            "        \"ticket\": \"$463.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"超体Lucy\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2201909284.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"295199人评价\",\n" +
            "        \"director\": \"吕克·贝松\",\n" +
            "        \"actor\": \"斯嘉丽·约翰逊/摩根·弗里曼/崔岷植\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 法国\",\n" +
            "        \"year\": \"2014\",\n" +
            "        \"ticket\": \"$463.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"赛车总动员Cars\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p593931509.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"100709人评价\",\n" +
            "        \"director\": \"约翰·拉塞特/乔·兰福特\",\n" +
            "        \"actor\": \"欧文·威尔逊/保罗·纽曼/邦尼·亨特\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$462.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"角斗士Gladiator\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1601948450.jpg\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"ratingNum\": \"135673人评价\",\n" +
            "        \"director\": \"雷德利·斯科特\",\n" +
            "        \"actor\": \"罗素·克劳/杰昆·菲尼克斯/康妮·尼尔森\",\n" +
            "        \"type\": \"剧情/动作/历史/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2000\",\n" +
            "        \"ticket\": \"$460.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"X战警3：背水一战X-Men: TheLastStand\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2230029851.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"146245人评价\",\n" +
            "        \"director\": \"布莱特·拉特纳\",\n" +
            "        \"actor\": \"休·杰克曼/哈莉·贝瑞/伊恩·麦克莱恩\",\n" +
            "        \"type\": \"动作/科幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/加拿大/英国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$459.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"碟中谍Mission: Impossible\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1660124103.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"155413人评价\",\n" +
            "        \"director\": \"布莱恩·德·帕尔玛\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/强·沃特/让·雷诺\",\n" +
            "        \"type\": \"动作/冒险/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1996\",\n" +
            "        \"ticket\": \"$457.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"国家宝藏：夺宝秘笈NationalTreasure: BookofSecrets\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1102384696.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"77786人评价\",\n" +
            "        \"director\": \"乔·德特杜巴\",\n" +
            "        \"actor\": \"尼古拉斯·凯奇/贾斯汀·巴萨/黛安·克鲁格\",\n" +
            "        \"type\": \"动作/冒险/喜剧/悬疑/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$457.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"最后的武士TheLastSamurai\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1431406518.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"48342人评价\",\n" +
            "        \"director\": \"爱德华·兹威克\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/渡边谦/蒂莫西·斯波\",\n" +
            "        \"type\": \"动作/冒险/剧情/历史/战争\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$456.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"斯巴达300勇士300\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p443321967.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"100047人评价\",\n" +
            "        \"director\": \"扎克·施奈德\",\n" +
            "        \"actor\": \"杰拉德·巴特勒/文森特·里根/琳娜·海蒂\",\n" +
            "        \"type\": \"动作/历史/战争\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$456.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"十一罗汉Ocean'sEleven\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1973370351.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"118489人评价\",\n" +
            "        \"director\": \"史蒂文·索德伯格\",\n" +
            "        \"actor\": \"乔治·克鲁尼/布拉德·皮特/马特·达蒙\",\n" +
            "        \"type\": \"犯罪/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2001\",\n" +
            "        \"ticket\": \"$450.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"雷神Thor\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2159068249.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"174195人评价\",\n" +
            "        \"director\": \"肯尼思·布拉纳\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯/娜塔莉·波特曼/汤姆·希德勒斯顿\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$449.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"珍珠港PearlHarbor\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1340424701.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"160019人评价\",\n" +
            "        \"director\": \"迈克尔·贝\",\n" +
            "        \"actor\": \"本·阿弗莱克/乔什·哈奈特/凯特·贝金赛尔\",\n" +
            "        \"type\": \"剧情/历史/爱情/战争\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2001\",\n" +
            "        \"ticket\": \"$449.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"泰山Tarzan\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1833041570.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"73150人评价\",\n" +
            "        \"director\": \"ChrisBuck/KevinLima\",\n" +
            "        \"actor\": \"托尼·戈德温/明妮·德里弗/格伦·克洛斯\",\n" +
            "        \"type\": \"动画/冒险/剧情/家庭\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1999\",\n" +
            "        \"ticket\": \"$448.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"爱乐之城LaLaLand\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2425658570.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"434658人评价\",\n" +
            "        \"director\": \"达米恩·查泽雷\",\n" +
            "        \"actor\": \"瑞恩·高斯林/艾玛·斯通/约翰·传奇\",\n" +
            "        \"type\": \"剧情/爱情/歌舞\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$446.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"鼠来宝：明星俱乐部AlvinandtheChipmunks: TheSqueakquel\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p815699212.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"19127人评价\",\n" +
            "        \"director\": \"贝蒂·托马斯\",\n" +
            "        \"actor\": \"贾斯汀·朗/安娜·法瑞丝/马修·格雷·古柏勒\",\n" +
            "        \"type\": \"动画/喜剧/家庭/奇幻/音乐\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$443.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"谍影重重3TheBourneUltimatum\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p792223507.jpg\",\n" +
            "        \"score\": \"8.7\",\n" +
            "        \"ratingNum\": \"217186人评价\",\n" +
            "        \"director\": \"保罗·格林格拉斯\",\n" +
            "        \"actor\": \"马特·达蒙/朱丽娅·斯蒂尔斯/大卫·斯特雷泽恩\",\n" +
            "        \"type\": \"动作/悬疑/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/德国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$442.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"黑衣人2MeninBlackII\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p453515660.jpg\",\n" +
            "        \"score\": \"7.5\",\n" +
            "        \"ratingNum\": \"132652人评价\",\n" +
            "        \"director\": \"巴里·索南菲尔德\",\n" +
            "        \"actor\": \"威尔·史密斯/汤米·李·琼斯/约翰尼·诺克斯维尔\",\n" +
            "        \"type\": \"动作/喜剧/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2002\",\n" +
            "        \"ticket\": \"$441.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"悲惨世界LesMisérables\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1900812761.jpg\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"ratingNum\": \"228053人评价\",\n" +
            "        \"director\": \"汤姆·霍珀\",\n" +
            "        \"actor\": \"休·杰克曼/罗素·克劳/安妮·海瑟薇\",\n" +
            "        \"type\": \"剧情/爱情/音乐\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$441.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"驱魔人TheExorcist\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1495239725.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"40161人评价\",\n" +
            "        \"director\": \"威廉·弗莱德金\",\n" +
            "        \"actor\": \"艾伦·伯斯汀/马克斯·冯·叙多夫/李·科布\",\n" +
            "        \"type\": \"恐怖\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1973\",\n" +
            "        \"ticket\": \"$441.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"窈窕奶爸Mrs.Doubtfire\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2177818413.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"11031人评价\",\n" +
            "        \"director\": \"克里斯·哥伦布\",\n" +
            "        \"actor\": \"罗宾·威廉姆斯/莎莉·菲尔德/皮尔斯·布鲁斯南\",\n" +
            "        \"type\": \"喜剧/剧情/家庭\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1993\",\n" +
            "        \"ticket\": \"$441.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"终结者：创世纪TerminatorGenisys\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2262649521.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"99843人评价\",\n" +
            "        \"director\": \"阿兰·泰勒\",\n" +
            "        \"actor\": \"阿诺·施瓦辛格/杰森·克拉克/艾米莉亚·克拉克\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$440.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"马戏之王TheGreatestShowman\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2511346392.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"97648人评价\",\n" +
            "        \"director\": \"迈克尔·格雷西\",\n" +
            "        \"actor\": \"休·杰克曼/米歇尔·威廉姆斯/扎克·埃夫隆\",\n" +
            "        \"type\": \"剧情/传记/歌舞\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$435.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"魔兽Warcraft\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2345947329.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"212074人评价\",\n" +
            "        \"director\": \"邓肯·琼斯\",\n" +
            "        \"actor\": \"崔维斯·费米尔/托比·凯贝尔/宝拉·巴顿\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/中国大陆/加拿大/日本\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$433.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"终结者3Terminator3: RiseoftheMachines\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p818710721.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"70076人评价\",\n" +
            "        \"director\": \"乔纳森·莫斯托\",\n" +
            "        \"actor\": \"阿诺·施瓦辛格/尼克·斯塔尔/克莱尔·丹妮丝\",\n" +
            "        \"type\": \"动作/科幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/德国/英国\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$433.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"木乃伊归来TheMummyReturns\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p847064824.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"88389人评价\",\n" +
            "        \"director\": \"斯蒂芬·索莫斯\",\n" +
            "        \"actor\": \"布兰登·费舍/蕾切尔·薇兹/道恩·强森\",\n" +
            "        \"type\": \"动作/冒险/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2001\",\n" +
            "        \"ticket\": \"$433.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"007之择日而亡DieAnotherDay\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p940106094.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"31060人评价\",\n" +
            "        \"director\": \"李·塔玛霍瑞\",\n" +
            "        \"actor\": \"皮尔斯·布鲁斯南/哈莉·贝瑞/托比·斯蒂芬斯\",\n" +
            "        \"type\": \"动作/惊悚/犯罪/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2002\",\n" +
            "        \"ticket\": \"$432.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"荒岛余生CastAway\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2207673534.jpg\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"ratingNum\": \"158704人评价\",\n" +
            "        \"director\": \"罗伯特·泽米吉斯\",\n" +
            "        \"actor\": \"汤姆·汉克斯/海伦·亨特/克里斯·诺斯\",\n" +
            "        \"type\": \"冒险/剧情\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2000\",\n" +
            "        \"ticket\": \"$429.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"黑客帝国3：矩阵革命TheMatrixRevolutions\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p443461818.jpg\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"ratingNum\": \"186897人评价\",\n" +
            "        \"director\": \"莉莉·沃卓斯基/拉娜·沃卓斯基\",\n" +
            "        \"actor\": \"基努·里维斯/劳伦斯·菲什伯恩/凯瑞-安·莫斯\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/澳大利亚\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$427.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"触不可及Intouchables\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1454261925.jpg\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"ratingNum\": \"472353人评价\",\n" +
            "        \"director\": \"奥利维埃·纳卡什/埃里克·托莱达诺\",\n" +
            "        \"actor\": \"弗朗索瓦·克鲁塞/奥玛·希/安娜·勒尼\",\n" +
            "        \"type\": \"剧情/喜剧\",\n" +
            "        \"country\": \"制片国家/地区: 法国\",\n" +
            "        \"year\": \"2011\",\n" +
            "        \"ticket\": \"$426.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"狂暴巨兽Rampage\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2516079193.jpg\",\n" +
            "        \"score\": \"6.4\",\n" +
            "        \"ratingNum\": \"97238人评价\",\n" +
            "        \"director\": \"布拉德·佩顿\",\n" +
            "        \"actor\": \"道恩·强森/娜奥米·哈里斯/杰弗里·迪恩·摩根\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$426.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"被解救的姜戈DjangoUnchained\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1959232369.jpg\",\n" +
            "        \"score\": \"8.6\",\n" +
            "        \"ratingNum\": \"304021人评价\",\n" +
            "        \"director\": \"昆汀·塔伦蒂诺\",\n" +
            "        \"actor\": \"杰米·福克斯/莱昂纳多·迪卡普里奥/克里斯托弗·沃尔兹\",\n" +
            "        \"type\": \"剧情/动作/西部/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$425.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"美女与野兽BeautyandtheBeast\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2238467474.jpg\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"ratingNum\": \"87264人评价\",\n" +
            "        \"director\": \"加里·特洛斯达勒/柯克·维斯\",\n" +
            "        \"actor\": \"佩吉·奥哈拉/罗比·本森/理查德·怀特\",\n" +
            "        \"type\": \"喜剧/爱情/动画/歌舞/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1991\",\n" +
            "        \"ticket\": \"$425.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"与狼共舞DanceswithWolves\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p499158228.jpg\",\n" +
            "        \"score\": \"8.9\",\n" +
            "        \"ratingNum\": \"58585人评价\",\n" +
            "        \"director\": \"凯文·科斯特纳\",\n" +
            "        \"actor\": \"凯文·科斯特纳/玛丽·麦克唐纳/格雷厄姆·格林\",\n" +
            "        \"type\": \"冒险/剧情/西部\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1990\",\n" +
            "        \"ticket\": \"$424.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"纳尼亚传奇2：凯斯宾王子TheChroniclesofNarnia: PrinceCaspian\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p815665348.jpg\",\n" +
            "        \"score\": \"6.8\",\n" +
            "        \"ratingNum\": \"62658人评价\",\n" +
            "        \"director\": \"安德鲁·亚当森\",\n" +
            "        \"actor\": \"乔芝·韩莉/斯堪德·凯恩斯/安娜·帕波维尔\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/波兰/斯洛文尼亚/捷克\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$419.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"木乃伊TheMummy\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1376881286.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"118387人评价\",\n" +
            "        \"director\": \"斯蒂芬·索莫斯\",\n" +
            "        \"actor\": \"布兰登·费舍/蕾切尔·薇兹/约翰·汉纳\",\n" +
            "        \"type\": \"动作/冒险/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1999\",\n" +
            "        \"ticket\": \"$415.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"纳尼亚传奇3：黎明踏浪号TheChroniclesofNarnia: TheVoyageoftheDawnTreader\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p743270605.jpg\",\n" +
            "        \"score\": \"6.6\",\n" +
            "        \"ratingNum\": \"50335人评价\",\n" +
            "        \"director\": \"迈克尔·艾普特\",\n" +
            "        \"actor\": \"本·巴恩斯/斯堪德·凯恩斯/乔芝·韩莉\",\n" +
            "        \"type\": \"剧情/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$415.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"谍影重重5JasonBourne\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2379032162.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"132773人评价\",\n" +
            "        \"director\": \"保罗·格林格拉斯\",\n" +
            "        \"actor\": \"马特·达蒙/汤米·李·琼斯/艾丽西亚·维坎德\",\n" +
            "        \"type\": \"动作/悬疑/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$415.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"欲望都市SexandtheCity\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2237613927.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"82479人评价\",\n" +
            "        \"director\": \"迈克尔·帕特里克·金\",\n" +
            "        \"actor\": \"莎拉·杰茜卡·帕克/金·凯特罗尔/克里斯汀·戴维斯\",\n" +
            "        \"type\": \"喜剧/剧情/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$415.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"金刚狼2TheWolverine\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2151837713.jpg\",\n" +
            "        \"score\": \"6.3\",\n" +
            "        \"ratingNum\": \"121890人评价\",\n" +
            "        \"director\": \"詹姆斯·曼高德\",\n" +
            "        \"actor\": \"休·杰克曼/冈本多绪/福岛莉拉\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$414.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"王牌特工：特工学院Kingsman: TheSecretService\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2231932406.jpg\",\n" +
            "        \"score\": \"8.4\",\n" +
            "        \"ratingNum\": \"396164人评价\",\n" +
            "        \"director\": \"马修·沃恩\",\n" +
            "        \"actor\": \"塔伦·埃格顿/科林·费尔斯/塞缪尔·杰克逊\",\n" +
            "        \"type\": \"喜剧/动作/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$414.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"国王的演讲TheKing'sSpeech\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p768879237.jpg\",\n" +
            "        \"score\": \"8.3\",\n" +
            "        \"ratingNum\": \"387786人评价\",\n" +
            "        \"director\": \"汤姆·霍珀\",\n" +
            "        \"actor\": \"科林·费尔斯/杰弗里·拉什/海伦娜·伯翰·卡特\",\n" +
            "        \"type\": \"剧情/传记/历史\",\n" +
            "        \"country\": \"制片国家/地区: 英国/澳大利亚/美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$414.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"博物馆奇妙夜2NightattheMuseum: BattleoftheSmithsonian\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1381135172.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"108214人评价\",\n" +
            "        \"director\": \"肖恩·利维\",\n" +
            "        \"actor\": \"本·斯蒂勒/艾米·亚当斯/欧文·威尔逊\",\n" +
            "        \"type\": \"喜剧/动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/加拿大\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$413.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"蝙蝠侠Batman\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1502638000.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"30287人评价\",\n" +
            "        \"director\": \"蒂姆·波顿\",\n" +
            "        \"actor\": \"迈克尔·基顿/杰克·尼科尔森/金·贝辛格\",\n" +
            "        \"type\": \"动作/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"1989\",\n" +
            "        \"ticket\": \"$411.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"保镖TheBodyguard\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1679820460.jpg\",\n" +
            "        \"score\": \"7.9\",\n" +
            "        \"ratingNum\": \"58253人评价\",\n" +
            "        \"director\": \"米克·杰克逊\",\n" +
            "        \"actor\": \"凯文·科斯特纳/惠特尼·休斯顿/加里·凯普\",\n" +
            "        \"type\": \"剧情/爱情/音乐\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1992\",\n" +
            "        \"ticket\": \"$411.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"环太平洋PacificRim\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2043625972.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"304278人评价\",\n" +
            "        \"director\": \"吉尔莫·德尔·托罗\",\n" +
            "        \"actor\": \"查理·汉纳姆/菊地凛子/伊德里斯·艾尔巴\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$411.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"王牌特工2：黄金圈Kingsman: TheGoldenCircle\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"226747人评价\",\n" +
            "        \"director\": \"马修·沃恩\",\n" +
            "        \"actor\": \"塔伦·埃格顿/科林·费尔斯/马克·斯特朗\",\n" +
            "        \"type\": \"喜剧/动作/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$410.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"新木乃伊TheMummy\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2459198108.jpg\",\n" +
            "        \"score\": \"4.7\",\n" +
            "        \"ratingNum\": \"92346人评价\",\n" +
            "        \"director\": \"艾里克斯·库兹曼\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/罗素·克劳/安娜贝拉·沃丽丝\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$409.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"冰川时代5：星际碰撞IceAge: CollisionCourse\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2365823697.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"ratingNum\": \"48424人评价\",\n" +
            "        \"director\": \"麦克·特米尔/加仑·T·楚\",\n" +
            "        \"actor\": \"西蒙·佩吉/洁茜J/杰西·泰勒·弗格森\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$408.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"天兆Signs\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p453508337.jpg\",\n" +
            "        \"score\": \"6.5\",\n" +
            "        \"ratingNum\": \"13508人评价\",\n" +
            "        \"director\": \"M·奈特·沙马兰\",\n" +
            "        \"actor\": \"梅尔·吉布森/杰昆·菲尼克斯/罗瑞·卡尔金\",\n" +
            "        \"type\": \"剧情/悬疑/科幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2002\",\n" +
            "        \"ticket\": \"$408.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"X战警2X2\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p726784568.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"150988人评价\",\n" +
            "        \"director\": \"布莱恩·辛格\",\n" +
            "        \"actor\": \"帕特里克·斯图尔特/休·杰克曼/伊恩·麦克莱恩\",\n" +
            "        \"type\": \"动作/科幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/加拿大\",\n" +
            "        \"year\": \"2003\",\n" +
            "        \"ticket\": \"$407.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"普罗米修斯Prometheus\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1548920463.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"218197人评价\",\n" +
            "        \"director\": \"雷德利·斯科特\",\n" +
            "        \"actor\": \"劳米·拉佩斯/迈克尔·法斯宾德/查理兹·塞隆\",\n" +
            "        \"type\": \"科幻/惊悚/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$403.4百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"木乃伊3TheMummy: TomboftheDragonEmperor\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2165575576.jpg\",\n" +
            "        \"score\": \"5.4\",\n" +
            "        \"ratingNum\": \"70826人评价\",\n" +
            "        \"director\": \"罗伯·科恩\",\n" +
            "        \"actor\": \"布兰登·费舍/李连杰/玛丽亚·贝罗\",\n" +
            "        \"type\": \"动作/冒险/奇幻/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/德国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$401.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"乱世佳人GonewiththeWind\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.jpg\",\n" +
            "        \"score\": \"9.2\",\n" +
            "        \"ratingNum\": \"337260人评价\",\n" +
            "        \"director\": \"维克多·弗莱明/乔治·库克/山姆·伍德\",\n" +
            "        \"actor\": \"费雯·丽/克拉克·盖博/奥利维娅·德哈维兰\",\n" +
            "        \"type\": \"剧情/历史/爱情/战争\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1939\",\n" +
            "        \"ticket\": \"$400.2百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"创：战纪TRON: Legacy\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p684659296.jpg\",\n" +
            "        \"score\": \"6.5\",\n" +
            "        \"ratingNum\": \"77258人评价\",\n" +
            "        \"director\": \"约瑟夫·科辛斯基\",\n" +
            "        \"actor\": \"加内特·赫德兰/奥利维亚·王尔德/杰夫·布里吉斯\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2010\",\n" +
            "        \"ticket\": \"$400.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"碟中谍3Mission: ImpossibleIII\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p802439727.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"115702人评价\",\n" +
            "        \"director\": \"J·J·艾布拉姆斯\",\n" +
            "        \"actor\": \"汤姆·克鲁斯/菲利普·塞默·霍夫曼/文·瑞姆斯\",\n" +
            "        \"type\": \"动作/冒险/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/德国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$397.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"白雪公主与猎人SnowWhiteandtheHuntsman\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1571501128.jpg\",\n" +
            "        \"score\": \"5.4\",\n" +
            "        \"ratingNum\": \"49840人评价\",\n" +
            "        \"director\": \"鲁伯特·桑德斯\",\n" +
            "        \"actor\": \"克里斯·海姆斯沃斯/克里斯汀·斯图尔特/查理兹·塞隆\",\n" +
            "        \"type\": \"动作/奇幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2012\",\n" +
            "        \"ticket\": \"$396.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"油脂Grease\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p928948150.jpg\",\n" +
            "        \"score\": \"7.4\",\n" +
            "        \"ratingNum\": \"3921人评价\",\n" +
            "        \"director\": \"兰德尔·克莱泽\",\n" +
            "        \"actor\": \"约翰·特拉沃尔塔/奥莉维亚·纽顿-约翰/斯托卡特·詹宁\",\n" +
            "        \"type\": \"歌舞/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1978\",\n" +
            "        \"ticket\": \"$395.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"暮光之城Twilight\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1869729517.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"310921人评价\",\n" +
            "        \"director\": \"凯瑟琳·哈德威克\",\n" +
            "        \"actor\": \"克里斯汀·斯图尔特/罗伯特·帕丁森/比利·伯克\",\n" +
            "        \"type\": \"剧情/爱情/惊悚/奇幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$393.6百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"游侠索罗：星球大战外传Solo: AStarWarsStory\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2521436880.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"34848人评价\",\n" +
            "        \"director\": \"朗·霍华德\",\n" +
            "        \"actor\": \"阿尔登·埃伦瑞奇/艾米莉亚·克拉克/伍迪·哈里森\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$392.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"妈妈咪呀2MammaMia!HereWeGoAgain\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2528272481.jpg\",\n" +
            "        \"score\": \"7.2\",\n" +
            "        \"ratingNum\": \"12921人评价\",\n" +
            "        \"director\": \"欧·帕克\",\n" +
            "        \"actor\": \"莉莉·詹姆斯/阿曼达·塞弗里德/朱丽·沃特斯\",\n" +
            "        \"type\": \"喜剧/爱情/歌舞\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2018\",\n" +
            "        \"ticket\": \"$392.8百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"华尔街之狼TheWolfofWallStreet\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2160254162.jpg\",\n" +
            "        \"score\": \"7.7\",\n" +
            "        \"ratingNum\": \"174237人评价\",\n" +
            "        \"director\": \"马丁·斯科塞斯\",\n" +
            "        \"actor\": \"莱昂纳多·迪卡普里奥/乔纳·希尔/玛格特·罗比\",\n" +
            "        \"type\": \"剧情/喜剧/传记/犯罪\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2013\",\n" +
            "        \"ticket\": \"$392.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"超人归来SupermanReturns\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p457079860.jpg\",\n" +
            "        \"score\": \"6.6\",\n" +
            "        \"ratingNum\": \"52117人评价\",\n" +
            "        \"director\": \"布莱恩·辛格\",\n" +
            "        \"actor\": \"布兰登·罗斯/凯特·波茨沃斯/凯文·史派西\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$391.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"侠盗王子罗宾汉RobinHood: PrinceofThieves\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1629602607.jpg\",\n" +
            "        \"score\": \"7.1\",\n" +
            "        \"ratingNum\": \"4122人评价\",\n" +
            "        \"director\": \"凯文·雷诺兹\",\n" +
            "        \"actor\": \"凯文·科斯特纳/摩根·弗里曼/玛丽·伊丽莎白·马斯特兰托尼奥\",\n" +
            "        \"type\": \"剧情/动作/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1991\",\n" +
            "        \"ticket\": \"$390.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"夺宝奇兵RaidersoftheLostArk\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1709111484.jpg\",\n" +
            "        \"score\": \"7.8\",\n" +
            "        \"ratingNum\": \"51674人评价\",\n" +
            "        \"director\": \"史蒂文·斯皮尔伯格\",\n" +
            "        \"actor\": \"哈里森·福特/凯伦·阿兰/保罗·弗里曼\",\n" +
            "        \"type\": \"动作/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1981\",\n" +
            "        \"ticket\": \"$389.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"独立日2：卷土重来IndependenceDay: Resurgence\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2362976267.jpg\",\n" +
            "        \"score\": \"5.6\",\n" +
            "        \"ratingNum\": \"85308人评价\",\n" +
            "        \"director\": \"罗兰·艾默里奇\",\n" +
            "        \"actor\": \"利亚姆·海姆斯沃斯/杰夫·高布伦/比尔·普尔曼\",\n" +
            "        \"type\": \"动作/科幻/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2016\",\n" +
            "        \"ticket\": \"$389.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"疯狂外星人Home\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2235609577.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"48933人评价\",\n" +
            "        \"director\": \"蒂姆·约翰逊\",\n" +
            "        \"actor\": \"吉姆·帕森斯/蕾哈娜/史蒂夫·马丁\",\n" +
            "        \"type\": \"喜剧/科幻/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$386.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"星际迷航StarTrek\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p455376387.jpg\",\n" +
            "        \"score\": \"8.0\",\n" +
            "        \"ratingNum\": \"110316人评价\",\n" +
            "        \"director\": \"J·J·艾布拉姆斯\",\n" +
            "        \"actor\": \"克里斯·派恩/扎克瑞·昆图/伦纳德·尼莫伊\",\n" +
            "        \"type\": \"动作/冒险/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国/德国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$385.7百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"捉妖记\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2257944916.jpg\",\n" +
            "        \"score\": \"6.7\",\n" +
            "        \"ratingNum\": \"310658人评价\",\n" +
            "        \"director\": \"许诚毅\",\n" +
            "        \"actor\": \"白百何/井柏然/姜武\",\n" +
            "        \"type\": \"喜剧/奇幻/古装\",\n" +
            "        \"country\": \"制片国家/地区: 中国大陆/香港\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$385.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"快乐的大脚HappyFeet\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2199294148.jpg\",\n" +
            "        \"score\": \"7.3\",\n" +
            "        \"ratingNum\": \"59127人评价\",\n" +
            "        \"director\": \"乔治·米勒/沃伦·科尔曼/朱迪·莫里斯\",\n" +
            "        \"actor\": \"伊莱贾·伍德/布莱特妮·墨菲/休·杰克曼\",\n" +
            "        \"type\": \"动画/冒险/喜剧/家庭/音乐/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 澳大利亚/美国\",\n" +
            "        \"year\": \"2006\",\n" +
            "        \"ticket\": \"$384.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"赛车总动员3：极速挑战Cars3\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2492869476.jpg\",\n" +
            "        \"score\": \"7.0\",\n" +
            "        \"ratingNum\": \"24121人评价\",\n" +
            "        \"director\": \"布莱恩·菲\",\n" +
            "        \"actor\": \"欧文·威尔逊/克里斯黛拉·阿朗索/克里斯·库珀\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2017\",\n" +
            "        \"ticket\": \"$383.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"虎胆龙威4LiveFreeorDieHard\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1617439899.jpg\",\n" +
            "        \"score\": \"7.6\",\n" +
            "        \"ratingNum\": \"57667人评价\",\n" +
            "        \"director\": \"伦·怀斯曼\",\n" +
            "        \"actor\": \"布鲁斯·威利斯/蒂莫西·奥利芬特/贾斯汀·朗\",\n" +
            "        \"type\": \"动作/犯罪/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国/英国\",\n" +
            "        \"year\": \"2007\",\n" +
            "        \"ticket\": \"$383.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"冰川时代IceAge\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p1910895719.jpg\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"ratingNum\": \"324266人评价\",\n" +
            "        \"director\": \"卡洛斯·沙尔丹哈/克里斯·韦奇\",\n" +
            "        \"actor\": \"雷·罗马诺/约翰·雷吉扎莫/丹尼斯·利瑞\",\n" +
            "        \"type\": \"喜剧/动画/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2002\",\n" +
            "        \"ticket\": \"$383.3百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"大战外星人Monstersvs.Aliens\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2204397540.jpg\",\n" +
            "        \"score\": \"6.9\",\n" +
            "        \"ratingNum\": \"25191人评价\",\n" +
            "        \"director\": \"罗伯·莱特曼/康拉德·弗农\",\n" +
            "        \"actor\": \"瑞茜·威瑟斯彭/塞斯·罗根/休·劳瑞\",\n" +
            "        \"type\": \"动画/动作/冒险/喜剧/家庭/科幻\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"2009\",\n" +
            "        \"ticket\": \"$381.5百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"回到未来BacktotheFuture\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p475872903.jpg\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"ratingNum\": \"86993人评价\",\n" +
            "        \"director\": \"罗伯特·泽米吉斯\",\n" +
            "        \"actor\": \"迈克尔·J·福克斯/克里斯托弗·洛伊德/莉·汤普森\",\n" +
            "        \"type\": \"喜剧/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1985\",\n" +
            "        \"ticket\": \"$381.1百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"哥斯拉Godzilla\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p1583456026.jpg\",\n" +
            "        \"score\": \"7.0\",\n" +
            "        \"ratingNum\": \"49268人评价\",\n" +
            "        \"director\": \"罗兰·艾默里奇\",\n" +
            "        \"actor\": \"马修·布罗德里克/让·雷诺/玛丽亚·皮提罗\",\n" +
            "        \"type\": \"动作/科幻/冒险/灾难\",\n" +
            "        \"country\": \"制片国家/地区: 美国/日本\",\n" +
            "        \"year\": \"1998\",\n" +
            "        \"ticket\": \"$379.0百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"真实的谎言TrueLies\",\n" +
            "        \"pic\": \"https: //img1.doubanio.com/view/photo/s_ratio_poster/public/p2408831888.jpg\",\n" +
            "        \"score\": \"8.1\",\n" +
            "        \"ratingNum\": \"107406人评价\",\n" +
            "        \"director\": \"詹姆斯·卡梅隆\",\n" +
            "        \"actor\": \"阿诺·施瓦辛格/杰米·李·柯蒂斯/汤姆·阿诺德\",\n" +
            "        \"type\": \"喜剧/动作/惊悚\",\n" +
            "        \"country\": \"制片国家/地区: 美国\",\n" +
            "        \"year\": \"1994\",\n" +
            "        \"ticket\": \"$378.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"疯狂的麦克斯4：狂暴之路MadMax: FuryRoad\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2236181653.jpg\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"ratingNum\": \"239804人评价\",\n" +
            "        \"director\": \"乔治·米勒\",\n" +
            "        \"actor\": \"汤姆·哈迪/查理兹·塞隆/尼古拉斯·霍尔特\",\n" +
            "        \"type\": \"动作/科幻/冒险\",\n" +
            "        \"country\": \"制片国家/地区: 澳大利亚/美国\",\n" +
            "        \"year\": \"2015\",\n" +
            "        \"ticket\": \"$378.9百万\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"贫民窟的百万富翁SlumdogMillionaire\",\n" +
            "        \"pic\": \"https: //img3.doubanio.com/view/photo/s_ratio_poster/public/p2434249040.jpg\",\n" +
            "        \"score\": \"8.5\",\n" +
            "        \"ratingNum\": \"447626人评价\",\n" +
            "        \"director\": \"丹尼·博伊尔/洛芙琳·坦丹\",\n" +
            "        \"actor\": \"戴夫·帕特尔/沙鲁巴·舒克拉/亚尼·卡普\",\n" +
            "        \"type\": \"剧情/爱情\",\n" +
            "        \"country\": \"制片国家/地区: 英国/美国\",\n" +
            "        \"year\": \"2008\",\n" +
            "        \"ticket\": \"$377.9百万\"\n" +
            "    },\n" +
            "]");

    public static List<JSONObject> worldTicketTopMovieData = null;
    static {
        worldTicketTopMovieData = JSON.parseObject(worldTicketTopMovieDataStr.toString(),List.class);
    }
}
