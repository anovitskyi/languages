package com.ano.laguages.utils;

public final class BotAPI {

    private static String BASE_URL = "https://api.telegram.org/bot725587106:AAH1nxDw4B7CWN3laIuKQDDDliNfSHa2w94";

    public static String getUpdates() {
        return BASE_URL + "/getUpdates";
    }

}
