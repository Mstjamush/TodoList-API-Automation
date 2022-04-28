/*
# set & get environment/globals variables
*/

package config;


public class ConfigProperties {
    public static config.ApplicationConfigReader appConfig = new config.ApplicationConfigReader();
    public static String htmlReportPath = appConfig.getHtmlReportPath();
    public static String baseUrl = appConfig.getBaseUrl();
    public static String logTestRail = appConfig.getLogTestRail();
    public static String isReportingEnable = appConfig.getIsEnableReporting();

    public static String sendEmail = appConfig.getSendEmailAfterExecution();
    public static String from = appConfig.getFrom();
    public static String[] To = appConfig.getTo();
    public static String fromPassword = appConfig.getFromPassword();

    public static String Project = appConfig.getProject();
    public static String Platform = appConfig.getPlatform();
    public static String Environment = appConfig.getEnviroment();
    public static String filePath = appConfig.getfilePath();





}
