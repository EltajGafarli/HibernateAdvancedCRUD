import java.util.Properties;

public class DBProperties {
    private static Properties properties(){

        Properties property = new Properties();
        property.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        property.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/hibernateCRUD");
        property.setProperty("hibernate.connection.username", "postgres");
        property.setProperty("hibernate.connection.password", "postgres");
        property.setProperty("hibernate.connection.pool_size", "1");
        property.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        property.setProperty("current_session_context_class", "thread");
        property.setProperty("cache.provider_class", "org.hibernate.cache.internal.NoCacheProvider");
        property.setProperty("hibernate.show_sql", "true");
        property.setProperty("hibernate.hbm2ddl.auto", "update");

        return property;
    }

    public static Properties getProperties(){
        return properties();
    }
}
