package com.oneblockmc.converter.type;

import de.tr7zw.changeme.nbtapi.NBTCompound;
import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.Getter;
import lombok.NonNull;

@Getter
public enum EliteEnchant {

    HEADLESS(1, 3),
    CONFUSION(1, 3),
    EXPERIENCE(1, 5),
    INSOMNIA(1, 7),
    LIGHTNING(1, 3),
    THUNDERING_BLOW(1, 3),
    DECAPITATION(1, 3),
    OBLITERATE(1, 5),
    HASTE(1, 3),
    HEALING(1, 4),
    AUTO_SMELT(1, 3),
    AQUATIC(1, 1),
    GLOWING(1, 1),
    OXYGENATE(1, 1),
    DEEP_WOUNDS(1, 3),
    FEATHERWEIGHT(1, 3),
    NUTRITION(1, 3),
    RAGDOLL(1, 4),
    OBSIDIAN_DESTROYER(1, 5),
    BERSERK(1, 5),
    PLAGUE_CARRIER(1, 8),
    SELF_DESTRUCT(1, 3),
    EXPLOSIVE(1, 5),
    MOLTEN(1, 4),
    RAVENOUS(1, 4),
    ENDER_SHIFT(1, 3),
    SKILL_SWIPE(1, 5),
    VIRUS(1, 4),
    CURSE(1, 5),
    TELEPATHY(1, 4),
    GREATSWORD(1, 5),
    HARDENED(1, 3),
    PARALYZE(1, 4),
    ROCKET_ESCAPE(1, 3),
    BLIND(1, 3),
    ANTI_GRAVITY(1, 3),
    POISON(1, 3),
    PUMMEL(1, 3),
    SHACKLE(1, 3),
    POISONED(1, 4),
    STORMCALLER(1, 4),
    INFERNAL(1, 3),
    VENOM(1, 3),
    SOLITUDE(1, 4),
    VAMPIRE(1, 3),
    FROZEN(1, 3),
    WITHER(1, 5),
    FARCAST(1, 5),
    SNARE(1, 4),
    SHOCKWAVE(1, 5),
    CACTUS(1, 2),
    REFORGED(1, 10),
    VOODOO(1, 6),
    SPRINGS(1, 3),
    DEMONFORGED(1, 4),
    UNDEAD_RUSE(1, 10),
    SMOKE_BOMB(1, 8),
    EXECUTE(1, 7),
    TRICKSTER(1, 8),
    TRAP(1, 3),
    MARKSMAN(1, 4),
    BLOCK(1, 3),
    DETONATE(1, 9),
    ENDER_WALKER(1, 5),
    ICE_ASPECT(1, 3),
    ASSASSIN(1, 5),
    UNFOCUS(1, 5),
    HEAVY(1, 5),
    GUARDIANS(1, 10),
    DODGE(1, 5),
    OBSIDIAN_SHIELD(1, 1),
    ARROW_LIFESTEAL(1, 5),
    HELLFIRE(1, 5),
    VALOR(1, 5),
    ARROW_BREAK(1, 6),
    LUCKY(1, 10),
    ENRAGE(1, 3),
    TANK(1, 4),
    BLESSED(1, 4),
    CLEAVE(1, 7),
    METAPHYSICAL(1, 4),
    ARROW_DEFLECT(1, 4),
    PACIFY(1, 4),
    DISINTEGRATE(1, 4),
    SPIRITS(1, 10),
    IMPLANTS(1, 3),
    DOMINATE(1, 4),
    LONGBOW(1, 4),
    ANGELIC(1, 5),
    PIERCING(1, 5),
    EAGLE_EYE(1, 5),
    BLEED(1, 6),
    FUSE(1, 1),
    DEATH_GOD(1, 3),
    HEX(1, 5),
    BLACKSMITH(1, 5),
    DOUBLE_STRIKE(1, 3),
    BARBARIAN(1, 4),
    BLOOD_LUST(1, 6),
    LIFESTEAL(1, 5),
    ENLIGHTED(1, 3),
    SILENCE(1, 4),
    INVERSION(1, 4),
    ANTI_GANK(1, 4),
    OVERLOAD(1, 3),
    AEGIS(1, 6),
    CLARITY(1, 3),
    DEVOUR(1, 4),
    INQUISITIVE(1, 4),
    ARMORED(1, 4),
    BLOOD_LINK(1, 5),
    SNIPER(1, 5),
    RAGE(1, 6),
    DRUNK(1, 4),
    DEATH_BRINGER(1, 3),
    DIMINISH(1, 6),
    GEARS(1, 3),
    INSANITY(1, 8),
    DESTRUCTION(1, 5),
    EXTERMINATOR(1, 3),
    TELEBLOCK(1, 5),
    IMMORTAL(1, 4),
    DIVINE_IMMOLATION(1, 4),
    SABOTAGE(1, 5),
    SOUL_TRAP(1, 3),
    PHOENIX(1, 3),
    NATURE_WRATH(1, 4),
    GODLY_OVERLOAD(1, 3),
    MASTER_INQUISITIVE(1, 4),
    SHADOW_ASSASSIN(1, 5),
    ALIEN_IMPLANTS(1, 3),
    ETHEREAL_DODGE(1, 5),
    PLANETARY_DEATHBRINGER(1, 3),
    DIVINE_ENLIGHTED(1, 3),
    ATOMIC_DETONATE(1, 4),
    DEMONIC_LIFESTEAL(1, 3),
    MASTER_BLACKSMITH(1, 5),
    PALADIN_ARMORED(1, 4),
    VENGEFUL_DIMINISH(1, 6),
    BIDIRECTIONAL_TELEPORTATION(1, 5),
    DEEP_BLEED(1, 6),
    GUIDED_ROCKET_ESCAPE(1, 3),
    MIGHTY_CACTUS(1, 2),
    MIGHTY_CLEAVE(1, 5),
    POLYMORPHIC_METAPHYSICAL(1, 4),
    REFLECTIVE_BLOCK(1, 3),
    REINFORCED_TANK(1, 4),
    TITAN_TRAP(1, 3),
    BEWITCHED_HEX(1, 5),
    EXTREME_INSANITY(1, 8),
    MEGA_HEAVY(1, 5),
    EPIDEMIC_CARRIER(1, 8),
    SOUL_HARDENED(1, 3),
    NEUTRALIZE(1, 5),
    MORTAL_COIL(1, 5),
    SOUL_SIPHONE(1, 4),
    ROT_AND_DECAY(1, 10),
    FEIGN_DEATH(1, 4),
    HORRIFY(1, 4),
    MARK_OF_THE_BEAST(1, 6),
    PERMAFROST(1, 6),
    CHAIN_LIFESTEAL(1, 5),
    DEATH_PACT(1, 3),
    LAVA_STRIDER(1, 1),
    WEB_WALKER(1, 1);

    private final static String ELITE_ENCHANTMENTS_NBT_KEY = "eliteenchantments_all";

    private final int min;
    private final int max;

    EliteEnchant(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean has(@NonNull NBTItem nbtItem) {
        if (nbtItem.hasKey(ELITE_ENCHANTMENTS_NBT_KEY)) {
            NBTCompound compound = nbtItem.getCompound(ELITE_ENCHANTMENTS_NBT_KEY);
            String keyName = name().toLowerCase().replace("_", "-");
            return compound.hasKey(keyName);
        }

        return false;
    }

    public int getLevel(@NonNull NBTItem nbtItem) {
        if (nbtItem.hasKey(ELITE_ENCHANTMENTS_NBT_KEY)) {
            NBTCompound compound = nbtItem.getCompound(ELITE_ENCHANTMENTS_NBT_KEY);
            String keyName = name().toLowerCase().replace("_", "-");
            return compound.getInteger(keyName);
        }

        return -1;
    }
}
