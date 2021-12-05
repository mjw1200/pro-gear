using Microsoft.Extensions.Hosting;
using System;
using System.Threading;
using System.Threading.Tasks;

namespace ConsoleApp1.DependencyInjection
{
    public class Jerker : BackgroundService
    {
        private readonly IMjwMessageWriter _messageWriter;

        public Jerker(IMjwMessageWriter messageWriter) =>
            _messageWriter = messageWriter;

        protected override async Task ExecuteAsync(CancellationToken stoppingToken)
        {
            while (!stoppingToken.IsCancellationRequested)
            {
                _messageWriter.MjwWrite($"Jerker running at: {DateTimeOffset.Now}");
                await Task.Delay(1000, stoppingToken);
            }
        }
    }
}
