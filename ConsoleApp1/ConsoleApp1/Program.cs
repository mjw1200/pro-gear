using ConsoleApp1.DependencyInjection;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    using ConsoleApp1.Xml;
    using System;
    using System.Xml.Serialization;

    class Program
    {
        static Task Main(string[] args) =>
            CreateHostBuilder(args).Build().RunAsync();

        static IHostBuilder CreateHostBuilder(string[] args) =>
            Host.CreateDefaultBuilder(args)
                .ConfigureServices((_, services) =>
                    services.AddHostedService<Worker>()
                            .AddScoped<IMessageWriter, LoggingMessageWriter>()
                            .AddHostedService<Jerker>()
                            .AddScoped<IMjwMessageWriter, MjwMessageWriter>());

                //.ConfigureServices((_, services) =>
                //    services.AddHostedService<Jerker>()
                //            .AddScoped<IMjwMessageWriter, MjwMessageWriter>());
    }
}
