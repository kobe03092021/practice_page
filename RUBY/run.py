import re
from crawler import Crawler, CrawlerCache
	
if __name__	== "__main__":

	crawler=Crawler(CrawlerCache('crawler.db'))
	root_re=re.compile('^/$').match
	crawler.crawl('Type HERE WebSite',no_cache=root_re)
	crawler.crawl('Type HERE WebSite',no_cache=root_re)
	crawler.crawl('Type HERE WebSite',no_cache=root_re)
	crawler.crawl('Type HERE WebSite',no_cache=root_re)
	crawler.crawl('Type HERE WebSite',no_cache=root_re)
	