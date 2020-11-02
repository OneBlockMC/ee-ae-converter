package com.oneblockmc.converter.type;

import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.Getter;
import lombok.NonNull;

@Getter
public enum AEEnchant {

    JELLYLEGS(1, 3),
    RESTORE(1, 4),
    SHUFFLE(1, 3),
    TAKEOFF(1, 1),
    AQUATIC(1, 3),
    AUTOSMELT(1, 3),
    CONFUSION(1, 3),
    ETHERAL(1, 3),
    EXPERIENCE(1, 5),
    HASTE(1, 3),
    INSOMNIA(1, 7),
    LIGHTNING(1, 3),
    OXYGENATE(1, 1),
    THUNDERINGBLOW(1, 3),
    GLOWING(1, 1),
    DECAPITATION(1, 3),
    HEADLESS(1, 3),
    OBLITERATE(1, 5),
    EPICNESS(1, 3),
    LIFEBLOOM(1, 5),
    FAMINE(1, 4),
    BERSERK(1, 5),
    WARD(1, 4),
    CURSE(1, 5),
    ENDERSHIFT(1, 3),
    EXPLOSIVE(1, 5),
    FEATHERWEIGHT(1, 3),
    MOLTEN(1, 4),
    RAVENOUS(1, 4),
    COMMANDER(1, 5),
    SELFDESTRUCT(1, 3),
    TELEPATHY(1, 4),
    SUSTAIN(1, 4),
    SKILLSWIPE(1, 5),
    PLAGUECARRIER(1, 8),
    VIRUS(1, 4),
    ANTIGRAVITY(1, 3),
    ENDERSLAYER(1, 5),
    REAPER(1, 4),
    NETHERSLAYER(1, 5),
    BLIND(1, 3),
    SHACKLE(1, 3),
    CACTUS(1, 2),
    EXECUTE(1, 7),
    FROZEN(1, 3),
    PARALYZE(1, 4),
    POISON(1, 3),
    POISONED(1, 4),
    REFORGED(1, 10),
    SNARE(1, 4),
    SPRINGS(1, 3),
    STORMCALLER(1, 4),
    DEMONFORGED(1, 4),
    TRAP(1, 3),
    UNDEADRUSE(1, 10),
    VENOM(1, 3),
    VOODOO(1, 6),
    WITHER(1, 5),
    SMOKEBOMB(1, 8),
    INFERNAL(1, 3),
    PUMMEL(1, 3),
    SHOCKWAVE(1, 5),
    VAMPIRE(1, 3),
    FARCAST(1, 5),
    GREATSWORD(1, 5),
    HARDENED(1, 3),
    ROCKETESCAPE(1, 3),
    TRICKSTER(1, 8),
    HIJACK(1, 4),
    TIMBER(1, 3),
    PICKPOCKET(1, 3),
    DISTANCE(1, 4),
    REINFORCED(1, 4),
    CLEAVE(1, 7),
    ANGELIC(1, 5),
    ARROWLIFESTEAL(1, 5),
    ARROWDEFLECT(1, 4),
    ARROWBREAK(1, 6),
    ASSASSIN(1, 5),
    BLESSED(1, 4),
    CORRUPT(1, 4),
    RAGDOLL(1, 4),
    BLOCK(1, 3),
    DETONATE(1, 9),
    DODGE(1, 5),
    ENRAGE(1, 3),
    GUARDIANS(1, 10),
    ICEASPECT(1, 3),
    IMPLANTS(1, 3),
    OBSIDIANSHIELD(1, 1),
    DEMONIC(1, 3),
    PIERCING(1, 5),
    MARKSMAN(1, 4),
    DISAPPEAR(1, 4),
    DISINTEGRATE(1, 4),
    DOMINATE(1, 4),
    ARSONIST(1, 3),
    ENDERWALKER(1, 5),
    EAGLEEYE(1, 5),
    ANNIHILATE(1, 6),
    HEAVY(1, 5),
    HELLFIRE(1, 5),
    LONGBOW(1, 4),
    TANK(1, 4),
    UNFOCUS(1, 5),
    VALOR(1, 5),
    PACIFY(1, 4),
    METAPHYSICAL(1, 4),
    CREEPERARMOR(1, 3),
    SPIRITS(1, 10),
    BLEED(1, 6),
    IMPALE(1, 4),
    PROTECTION(1, 5),
    TORRENT(1, 4),
    JUDGEMENT(1, 5),
    SURPRISE(1, 4),
    STUN(1, 3),
    UNHOLY(1, 5),
    QUIVER(1, 6),
    FAT(1, 6),
    HEX(1, 4),
    BARBARIAN(1, 4),
    CLARITY(1, 3),
    DEATHBRINGER(1, 3),
    DOUBLESTRIKE(1, 3),
    DRUNK(1, 4),
    ENLIGHTED(1, 3),
    GEARS(1, 3),
    KILLAURA(1, 5),
    INQUISITIVE(1, 4),
    INVERSION(1, 4),
    LIFESTEAL(1, 5),
    OVERLOAD(1, 3),
    RAGE(1, 6),
    SILENCE(1, 4),
    ARMORED(1, 4),
    EXTERMINATOR(1, 3),
    BLACKSMITH(1, 5),
    ABIDING(1, 1),
    DEVOUR(1, 4),
    DIMINISH(1, 6),
    DISARMOR(1, 8),
    DEATHGOD(1, 3),
    INSANITY(1, 8),
    SNIPER(1, 5),
    DESTRUCTION(1, 5),
    EXTREMEINSANITY(1, 8),
    MEGAHEAVY(1, 5),
    BEWITCHEDHEX(1, 4),
    MIGHTYCLEAVE(1, 5),
    MIGHTYCACTUS(1, 2),
    GUIDEDROCKETESCAPE(1, 3),
    SOULHARDENED(1, 3),
    POLYMORPHICMETAPHYSICAL(1, 4),
    SOULBOUND(1, 3),
    REINFORCEDTANK(1, 4),
    EPIDEMICCARRIER(1, 8),
    GODLYOVERLOAD(1, 3),
    REFLECTIVEBLOCK(1, 3),
    MASTERINQUISITIVE(1, 4),
    PLANETARYDEATHBRINGER(1, 3),
    DIVINEENLIGHTED(1, 3),
    LETHALSNIPER(1, 5),
    ATOMICDETONATE(1, 9),
    TITANTRAP(1, 3),
    BIDIRECTIONALTELEPORTATION(1, 4),
    MASTERBLACKSMITH(1, 5),
    VENGEFULDIMINISH(1, 6),
    ALIENIMPLANTS(1, 3),
    ETHEREALDODGE(1, 5),
    PALADINARMORED(1, 4),
    DEMONICLIFESTEAL(1, 5),
    DEEPBLEED(1, 6),
    SHADOWASSASSIN(1, 5),
    ROGUE(1, 3),
    SABOTAGE(1, 5),
    NATURESWRATH(1, 4),
    PHOENIX(1, 3),
    TELEBLOCK(1, 5),
    SOULTRAP(1, 3),
    IMMORTAL(1, 4),
    DIVINEIMMOLATION(1, 4),
    PARADOX(1, 5),
    SOULGRIND(1, 3),
    NEUTRALIZE(1, 5),
    HALLOWEENIFY(1, 5),
    MARKOFTHEBEAST(1, 6),
    HORRIFY(1, 4),
    CHAINLIFESTEAL(1, 5),
    POLTERGEIST(1, 3),
    FEIGNDEATH(1, 4),
    SOULSIPHONE(1, 4),
    DEATHPACT(1, 3),
    WEBWALKER(1, 1);

    private final static String AE_ENCHANTMENT_NBT_KEY = "ae_enchantment;%s";

    private final int min;
    private final int max;

    AEEnchant(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void add(@NonNull NBTItem nbtItem, int level) {
        String keyName = String.format(AE_ENCHANTMENT_NBT_KEY, name().toLowerCase());
        nbtItem.setInteger(keyName, Math.min(Math.max(level, min), max));
    }
}
