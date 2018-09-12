html = self.get(url)
n_urls = n_urls.union(get_local_links(htnl, self.domain))
self.set(url, html)
# donot crawl twice the same page (domain text, url text, content text) ''')
hrefs.add(u_parse.path)
if url not in self.content:
	self.hrefs.add(dict_attrs['href'])
# only keep the local urls
# purposefully using path, no query, no hash
(domain, url)
(domain, url, data)
#and not self.no_cache(url)
dict_attrs = dict(attrs)
for url in urls:
 hrefs.add(u_parse.path)
  if	u_parse.netloc == domain:
  if dict_attrs.get('href'):
 page = self.cache.get(self.domain, url)
 page = self.curl(url)
 print "cached url. . . [%s] %s" % (self.domain, url)
 print "error [%s] %s: %s" % (self.domain, url, e)
 print "retrieving url. . . [%s] %s" % (self.domain, url)
req = urllib2.Request('%s://%s%s' % (self.scheme, self.domain, url))
response = urllib2.urlopen(req)
return ' ' 
return response.read().decode('ascii', 'ignore')<br />
return row[0]
self._crawl(n_urls, max_depth-1)
self.cache.set(self.domain, url, html)
"""
"""
"""
"""
"""
"""
"""
"""
"""
"""
# ...Oh well
# could use fetchone and yield but I want to release
# my cursor after the call. I could have create a new cursor tho.
'http://www.intel.com/news/'
c = self.conn.cursor()
c.execute('''CREATE TABLE IF NOT EXISTS sites.
else:
else:
except urllib2.HTTPError, e:
if href.startwith(' / '):
if max_depth:
if page is None:
if row:
if self.is_cacheable(url):
if self.is_cacheable(url):
if tag == 'a':
n_urls = set()
no_cache:: function returning True if the url should be refreshed
page = None
return	[row[0] for row in self.cursor.etchall()]
return all the URLS within a domain
return content at url.
return empty string if response raise an HTTPError (not found, 500. . . )
return page
return self.cache and self.no_cache \
return the content for a given domain and relative url
row = self.cursor.fetchone()
self._crawl([u_parse.path], self.depth)
self.conn = sqlite3.connect(db_file)
self.conn.commit( )
self.conn.commit()
self.content[self.domain] = {}
self.content[self.domain] [url] = html
self.curosr.execute("INSERT INTO sites VALUES (?,?,?)",
self.cursor = self.conn.cursor()
self.cursor.execute("SELECT content FROM sites WHERE domain=? and url=?",
self.cursor.execute("SELECT url FROM sites WHERE domain=?", (domain, ))
self.domain = u_parse.netloc
self.no_chache = no_cache
self.scheme = u_parse.scheme
store the content for a given domain and relative url
try:
u_parse = urlparse(href)
u_parse = urlparse(url)
url: where we start crawling, should be a complete URL like
"""
"""
cache: a basic cache controller (optional)
depth: how many time it will bounce from page one (optional)
self.cache = cache
self.content = {}
self.depth = depth
"""
"""
"""
"""
"""
"""
Crawler data caching per relative URL and domain.
def	_crawl(self, urls, max_depth):
def	crawl(self, url, no_cache=None):
def	curl(self, url):
def	get(self, domain, url):
def	get_urls(self, domain):
def	handle_starttag(self, tag, attrs):
def	is_cacheable(self, url):
def	set(self, domain, url, data):
def 	get(self, url):
def 	set(self, url, html):
def __init__(self, cache=None, depth=2):
def __init__(self, db_file):
for	href	in	parser.hrefs:
hrefs = set( )
hrefs = set()
internal to the given domain
parser = HREFParser()
Parser that extracts hrefs
parser. feed(html)
Read through HTML content and returns a tuple of links
return hrefs
# -*- coding: utf-8 -*-
# filename: crawler.py
class	CrawlerCache(object):
class	HREFParser(HTMLParser):
class Crawler(object):
def	get_local_links(html, domain):
from	HTMLParser	import	HTMLParser
from	urlparse	import	urlparse
import	sqlite3
import	urllib2