# ParseMdForHexoBlog
根据md文件名批量加上title,让hexo能够自动生成标题

搭建了hexoblog后,发现我自己写的markdown笔记不能由hexo自动生成标题,
经过查询发现hexo是根据title来解析生成标题,解决办法就是为每一个md文件添加title,
由于我有50+的md文件,手动添加过于繁琐,故使用javaIO写了个小程序解决了批量添加title的问题.