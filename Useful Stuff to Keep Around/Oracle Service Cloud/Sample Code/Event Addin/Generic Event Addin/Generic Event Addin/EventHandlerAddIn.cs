using System.AddIn;
using System.Windows.Forms;
using RightNow.AddIns.AddInViews;

namespace Generic_Event_Addin
{   
    /// <summary>
    /// EventConsoleClose
    /// Handles console close events
    /// </summary>
    [AddIn("EventConsoleClose AddIn", Version = "1.0.0.0")]
    public class EventConsoleClose : IEventConsoleClose
    {
        #region IEventConsoleClose Members

        /// <summary>
        /// Method which is invoked when the "Console Close" event occurs.
        /// </summary>
        /// <param name="Reason">The reason for the console close.</param>
        public void Notify(CloseReason Reason)
        {
            // You can do anything you want on console close here
        }

        #endregion

        #region IAddInBase Members

        /// <summary>
        /// Method which is invoked from the Add-In framework and is used to programmatically control whether to load the Add-In.
        /// </summary>
        /// <param name="GlobalContext">The Global Context for the Add-In framework.</param>
        /// <returns>If true the Add-In to be loaded, if false the Add-In will not be loaded.</returns>
        public bool Initialize(IGlobalContext GlobalContext)
        {
            return true;
        }

        #endregion
    }

    /// <summary>
    /// EventConsoleOpen
    /// Handles console open events
    /// </summary>
    [AddIn("EventConsoleOpen AddIn", Version = "1.0.0.0")]
    public class EventConsoleOpen : IEventConsoleOpen
    {
        #region IAddInBase Members

        /// <summary>
        /// Method which is invoked from the Add-In framework and is used to programmatically control whether to load the Add-In.
        /// </summary>
        /// <param name="GlobalContext">The Global Context for the Add-In framework.</param>
        /// <returns>If true the Add-In to be loaded, if false the Add-In will not be loaded.</returns>
        public bool Initialize(IGlobalContext GlobalContext)
        {
            // The console open event doesn't have a separate "Notify" event like
            // the close event does, probably because it would be redundant. If we
            // get here...the console's opening.

            return true;
        }

        #endregion
    }
}
