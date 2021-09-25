using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AddInSamples
{
    public class SingletonContext
    {
        private static volatile SingletonContext _instance = null;
        private static object syncRoot = new Object();

        private Global_Ribbon.GlobalRibbonTabAddIn _globalRibbonTabAddIn;

        public Global_Ribbon.GlobalRibbonTabAddIn GlobalRibbonTabAddIn
        {
            get { return _globalRibbonTabAddIn; }
            set { _globalRibbonTabAddIn = value; }
        }

        private SingletonContext()
        {

        }

        //Double checked locking is supported by .NET
        public static SingletonContext GetInstance()
        {
            if (_instance == null)
            {
                lock (syncRoot)
                {
                    if (_instance == null)
                    {
                        _instance = new SingletonContext();
                    }
                }
            }

            return _instance;
        }
    }
}
