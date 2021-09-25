////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: RssFeedThread.cs
//
// Comments: A class for fetching and parsing RSS feed data.
//
// Notes: 
//
// Pre-Conditions: 
//          1. You must have enabled add-ins for the appropriate profile
//          2. You must have uploaded the compiled .dll to the RightNow server
//
////////////////////////////////////////////////////////////////////////////////
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;

namespace AddInSamples.Status_Bar
{
    public class RssFeedFetcher
    {
        public RssFeedFetcher()
        {
        }

        public List<RssFeedItem> GetRssFeeds()
        {
            return getRssFeeds();
        }

        private List<RssFeedItem> getRssFeeds()
        {
            List<RssFeedItem> rssItems = new List<RssFeedItem>();

            XmlTextReader rssReader = new XmlTextReader("http://finance.yahoo.com/rss/headline?s=rnow");
            XmlDocument rssDoc = new XmlDocument();
            rssDoc.Load(rssReader);

            XmlNodeList itemList = rssDoc.GetElementsByTagName("item");

            foreach (XmlNode itemNode in itemList)
            {
                RssFeedItem item = new RssFeedItem();

                item.Title = itemNode["title"].InnerText;
                item.Link = itemNode["link"].InnerText;
                item.Description = itemNode["description"].InnerText;
                item.PublicationDate = itemNode["pubDate"].InnerText;

                rssItems.Add(item);
            }

            return rssItems;
        }
    }
}
