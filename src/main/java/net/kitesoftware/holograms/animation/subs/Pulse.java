package net.kitesoftware.holograms.animation.subs;

import net.kitesoftware.holograms.animation.BaseAnimation;
import net.kitesoftware.holograms.util.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pulse extends BaseAnimation {

    public Pulse() {
        super("pulse", "Create a pulsating text", new HashMap<String, String>() {{
            put("color", "multi");
            put("pause", "1");
        }});
    }

    @Override
    public List<String> setAnimations(String text, Map<String, String> options) {
        ArrayList<String> frames = new ArrayList<String>();
        options = Utils.mergeMap(getOptions(), options);

        int pause = Integer.parseInt(options.get("pause"));
        String fadeto = options.get("color").toLowerCase();

        switch (fadeto) {
            case "multi":
                //Parse all... no break
            case "white":
                frames.add("§0" + text);
                frames.add("§8" + text);
                frames.add("§7" + text);
                frames.add("§f" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§f" + text);
                }
                frames.add("§f" + text);
                frames.add("§7" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }
                if (!fadeto.equalsIgnoreCase("multi")) {
                    break;
                }
            case "black":
                frames.add("§f" + text);
                frames.add("§7" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }
                frames.add("§0" + text);
                frames.add("§7" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }

                if (!fadeto.equalsIgnoreCase("multi")) {
                    break;
                }
            case "red":
                frames.add("§0" + text);
                frames.add("§8" + text);
                frames.add("§4" + text);
                frames.add("§c" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§c" + text);
                }
                frames.add("§c" + text);
                frames.add("§4" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }

                if (!fadeto.equalsIgnoreCase("multi")) {
                    break;
                }

            case "yellow":
                frames.add("§0" + text);
                frames.add("§8" + text);
                frames.add("§6" + text);
                frames.add("§e" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§e" + text);
                }
                frames.add("§e" + text);
                frames.add("§6" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }

                if (!fadeto.equalsIgnoreCase("multi")) {
                    break;
                }

            case "blue":
                frames.add("§0" + text);
                frames.add("§8" + text);
                frames.add("§1" + text);
                frames.add("§9" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§9" + text);
                }
                frames.add("§9" + text);
                frames.add("§1" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }
                if (!fadeto.equalsIgnoreCase("multi")) {
                    break;
                }

            case "pink":
                frames.add("§0" + text);
                frames.add("§8" + text);
                frames.add("§5" + text);
                frames.add("§d" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§d" + text);
                }
                frames.add("§5" + text);
                frames.add("§d" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }

                if (!fadeto.equalsIgnoreCase("multi")) {
                    break;
                }

            case "green":
                frames.add("§0" + text);
                frames.add("§8" + text);
                frames.add("§2" + text);
                frames.add("§a" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§a" + text);
                }
                frames.add("§a" + text);
                frames.add("§2" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }

                if (!fadeto.equalsIgnoreCase("multi")) {
                    break;
                }
            case "cyan":
                frames.add("§0" + text);
                frames.add("§8" + text);
                frames.add("§3" + text);
                frames.add("§b" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§b" + text);
                }
                frames.add("§b" + text);
                frames.add("§3" + text);
                frames.add("§8" + text);
                frames.add("§0" + text);
                for (int i = 0; i < pause; i++) {
                    frames.add("§0" + text);
                }

                break;

        }
        return frames;
    }
}
