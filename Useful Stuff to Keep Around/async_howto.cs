using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// To quickly silence the "async method lacks 'await' operators" warning...
// await Task.Run(() => System.Threading.Thread.Sleep(1));


namespace AsyncAwaitRevisited
{
    class HoldVals
    {
        public int IntProp { get; set; }
        public bool BoolProp { get; set; }
    }
}

//--//

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AsyncAwaitRevisited
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        /// <summary>
        /// Set up and run a task with an Action (returns void) that does not take a parameter
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private async void takesVoidReturnsVoidAsync(object sender, EventArgs e)
        {
            Task task = new Task(new Action(() =>
                {
                    Thread.Sleep(5000);
                }
            ));

            task.Start(); // Note you have to start the task, or nothing happens!
            await task;
            MessageBox.Show("void/void has returned");
        }

        /// <summary>
        /// Set up and run a task with an Action (returns void) that takes a parameter
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private async void takesParamReturnsVoidAsync(object sender, EventArgs e)
        {
            Task task = new Task(new Action<object>((h) =>
                {
                    HoldVals hv = h as HoldVals;
                    Thread.Sleep(5000);
                    System.Diagnostics.Debug.WriteLine("HoldVals: " + hv.IntProp + ", " + hv.BoolProp);
                }
                // This new HoldVals instance is named "state," but it's the object that gets passed
                // into the task when it runs.
            ), new HoldVals() { IntProp = 3, BoolProp = true });

            task.Start(); // Note you have to start the task, or nothing happens!
            await task;
            MessageBox.Show("param/void has returned");
        }

        /// <summary>
        /// Set up and run a task with a Func (returns a value) that does not take a parameter
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private async void takesVoidReturnsValueAsync(object sender, EventArgs e)
        {
            Task<int> task = new Task<int>(new Func<int>(() =>
                {
                    Thread.Sleep(5000);
                    return 17;
                }
            ));

            task.Start(); // Note you have to start the task, or nothing happens!
            int i = await task;
            MessageBox.Show("void/value has returned. Your value was " + i);
        }

        /// <summary>
        /// Set up and run a task with a Func (returns a value) that takes a parameter
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private async void takesParamReturnsValueAsync(object sender, EventArgs e)
        {
            // The first type argument to the Func constructor *must* be object. Then inside the
            // body of your task definition, cast it to whatever type is appropriate. 
            Task<int> task = new Task<int>(new Func<object, int>((h) =>
                {
                    HoldVals hv = h as HoldVals;
                    int rv = hv.IntProp * 3;
                    Thread.Sleep(5000);
                    return rv;
                }
                // This new HoldVals instance is named "state," but it's the object that gets passed
                // into the task when it runs.
            ), new HoldVals() { BoolProp = true, IntProp = 47 });

            task.Start(); // Note you have to start the task, or nothing happens!
            int i = await task;
            MessageBox.Show("param/value has returned. Your value was " + i);
        }
    }
}


