using Microsoft.Extensions.Logging;

namespace ConsoleApp1.DependencyInjection
{
    public class MjwMessageWriter : IMjwMessageWriter
    {
        private readonly ILogger<MjwMessageWriter> _logger;

        public MjwMessageWriter(ILogger<MjwMessageWriter> logger) =>
            _logger = logger;

        public void MjwWrite(string message) =>
            _logger.LogInformation(message);
    }
}
