////////////////////////////////////////////////////////////////////////////////
// Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
// Sample code provided for training purposes only. This sample code is
// provided "as is" with no warranties of any kind express or implied.
//
// File: RssFeedItem.cs
//
// Comments: A class for representing an RSS feed item.
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

namespace AddInSamples.Status_Bar
{
    public class RssFeedItem
    {
        private String _title;

        public String Title
        {
            get { return _title; }
            set { _title = value; }
        }

        private String _link;

        public String Link
        {
            get { return _link; }
            set { _link = value; }
        }

        private String _description;

        public String Description
        {
            get { return _description; }
            set { _description = value; }
        }

        private String _publicationDate;

        public String PublicationDate
        {
            get { return _publicationDate; }
            set { _publicationDate = value; }
        }
    }
}
