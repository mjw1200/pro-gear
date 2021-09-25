using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace AddInSamples.Status_Bar
{
    public class FeedDisplayThread
    {
        private LinkLabelDisplayUserControl _linkLabelUserControl;
        private RssFeedFetcher _rssFeedFetcher;
        private bool _keepRunning = true;

        public FeedDisplayThread(LinkLabelDisplayUserControl linkLabelUserControl, RssFeedFetcher rssFeedFetcher)
        {
            _linkLabelUserControl = linkLabelUserControl;
            _rssFeedFetcher = new RssFeedFetcher();
        }

        public bool KeepRunning
        {
            get { return _keepRunning; }
            set { _keepRunning = value; }
        }

        public void RotateLinks()
        {
            while (_keepRunning == true)
            {
                List<RssFeedItem> rssItems = _rssFeedFetcher.GetRssFeeds();

                foreach (RssFeedItem rssItem in rssItems)
                {
                    _linkLabelUserControl.SetLinkLabelFields(rssItem.Description, rssItem.Link, rssItem.Title);
                    Thread.Sleep(5000);
                }
            }
        }
    }
}
