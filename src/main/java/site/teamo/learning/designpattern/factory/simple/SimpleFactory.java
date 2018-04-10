package site.teamo.learning.designpattern.factory.simple;

public class SimpleFactory {
    public enum Type{
        ADMIN{
            protected User getUser(){
                return new AdminUser();
            }
        },
        NORMAL{
            protected User getUser(){
               return new NormalUser();
            }
        },
        ANONYMOUS{
            protected User getUser(){
                return new AnonymousUser();
            }
        };
        protected User getUser(){
            return null;
        }
    }

    public static <T> T createUser(Type type,Class<T> tClass){
        User user = type.getUser();
        user.init();
        return (T)user;
    }
}
