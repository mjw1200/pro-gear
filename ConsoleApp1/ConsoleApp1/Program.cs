namespace ConsoleApp1
{
    using ConsoleApp1.DependencyInjection;
    using Microsoft.Extensions.DependencyInjection;
    using Microsoft.Extensions.Hosting;
    using System.Threading.Tasks;

    class Program
    {
        static Task Main(string[] args) =>
            CreateHostBuilder(args).Build().RunAsync();

        static IHostBuilder CreateHostBuilder(string[] args)
        {
            return Host.CreateDefaultBuilder(args)
                .ConfigureServices((_, services) =>
                    services.AddHostedService<Worker>()
                            .AddScoped<IMessageWriter, LoggingMessageWriter>()
                            .AddHostedService<Jerker>()
                            .AddScoped<IMjwMessageWriter, MjwMessageWriter>());
        }
    }
}
