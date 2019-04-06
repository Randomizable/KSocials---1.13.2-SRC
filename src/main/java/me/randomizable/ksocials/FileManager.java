package me.randomizable.ksocials;


import java.io.File;

        public class FileManager {

            public void Setup() {
                File MainDirectory = new File("plugins/KSocials");
                if (!MainDirectory.exists()) {
                    MainDirectory.mkdir();
                }
            }
        }