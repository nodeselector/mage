package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

public final class WarOfTheSpark extends ExpansionSet {

    private static final WarOfTheSpark instance = new WarOfTheSpark();

    public static WarOfTheSpark getInstance() {
        return instance;
    }

    private WarOfTheSpark() {
        super("War of the Spark", "WAR", ExpansionSet.buildDate(2019, 5, 3), SetType.EXPANSION);
        this.blockName = "Guilds of Ravnica";
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.needsPlaneswalker = true;
        this.maxCardNumberInBooster = 264;

        cards.add(new SetCardInfo("Ahn-Crop Invader", 113, Rarity.COMMON, mage.cards.a.AhnCropInvader.class));
        cards.add(new SetCardInfo("Aid the Fallen", 76, Rarity.COMMON, mage.cards.a.AidTheFallen.class));
        cards.add(new SetCardInfo("Ajani's Pridemate", 4, Rarity.UNCOMMON, mage.cards.a.AjanisPridemate.class));
        cards.add(new SetCardInfo("Ajani, the Greathearted", 184, Rarity.RARE, mage.cards.a.AjaniTheGreathearted.class));
        cards.add(new SetCardInfo("Angrath's Rampage", 185, Rarity.UNCOMMON, mage.cards.a.AngrathsRampage.class));
        cards.add(new SetCardInfo("Angrath, Captain of Chaos", 227, Rarity.UNCOMMON, mage.cards.a.AngrathCaptainOfChaos.class));
        cards.add(new SetCardInfo("Arlinn's Wolf", 151, Rarity.COMMON, mage.cards.a.ArlinnsWolf.class));
        cards.add(new SetCardInfo("Arlinn, Voice of the Pack", 150, Rarity.UNCOMMON, mage.cards.a.ArlinnVoiceOfThePack.class));
        cards.add(new SetCardInfo("Ashiok, Dream Render", 228, Rarity.UNCOMMON, mage.cards.a.AshiokDreamRender.class));
        cards.add(new SetCardInfo("Augur of Bolas", 41, Rarity.UNCOMMON, mage.cards.a.AugurOfBolas.class));
        cards.add(new SetCardInfo("Awakening of Vitu-Ghazi", 152, Rarity.RARE, mage.cards.a.AwakeningOfVituGhazi.class));
        cards.add(new SetCardInfo("Band Together", 153, Rarity.COMMON, mage.cards.b.BandTogether.class));
        cards.add(new SetCardInfo("Banehound", 77, Rarity.COMMON, mage.cards.b.Banehound.class));
        cards.add(new SetCardInfo("Blindblast", 114, Rarity.COMMON, mage.cards.b.Blindblast.class));
        cards.add(new SetCardInfo("Bloom Hulk", 154, Rarity.COMMON, mage.cards.b.BloomHulk.class));
        cards.add(new SetCardInfo("Bolt Bend", 115, Rarity.UNCOMMON, mage.cards.b.BoltBend.class));
        cards.add(new SetCardInfo("Bond of Discipline", 6, Rarity.UNCOMMON, mage.cards.b.BondOfDiscipline.class));
        cards.add(new SetCardInfo("Bond of Flourishing", 155, Rarity.UNCOMMON, mage.cards.b.BondOfFlourishing.class));
        cards.add(new SetCardInfo("Bond of Insight", 43, Rarity.UNCOMMON, mage.cards.b.BondOfInsight.class));
        cards.add(new SetCardInfo("Bond of Passion", 116, Rarity.UNCOMMON, mage.cards.b.BondOfPassion.class));
        cards.add(new SetCardInfo("Bond of Revival", 80, Rarity.UNCOMMON, mage.cards.b.BondOfRevival.class));
        cards.add(new SetCardInfo("Bulwark Giant", 7, Rarity.COMMON, mage.cards.b.BulwarkGiant.class));
        cards.add(new SetCardInfo("Burning Prophet", 117, Rarity.COMMON, mage.cards.b.BurningProphet.class));
        cards.add(new SetCardInfo("Chainwhip Cyclops", 118, Rarity.COMMON, mage.cards.c.ChainwhipCyclops.class));
        cards.add(new SetCardInfo("Challenger Troll", 157, Rarity.UNCOMMON, mage.cards.c.ChallengerTroll.class));
        cards.add(new SetCardInfo("Chandra's Pyrohelix", 120, Rarity.COMMON, mage.cards.c.ChandrasPyrohelix.class));
        cards.add(new SetCardInfo("Chandra's Triumph", 121, Rarity.UNCOMMON, mage.cards.c.ChandrasTriumph.class));
        cards.add(new SetCardInfo("Chandra, Fire Artisan", 119, Rarity.RARE, mage.cards.c.ChandraFireArtisan.class));
        cards.add(new SetCardInfo("Commence the Endgame", 45, Rarity.RARE, mage.cards.c.CommenceTheEndgame.class));
        cards.add(new SetCardInfo("Courage in Crisis", 158, Rarity.COMMON, mage.cards.c.CourageInCrisis.class));
        cards.add(new SetCardInfo("Cruel Celebrant", 188, Rarity.UNCOMMON, mage.cards.c.CruelCelebrant.class));
        cards.add(new SetCardInfo("Crush Dissent", 47, Rarity.COMMON, mage.cards.c.CrushDissent.class));
        cards.add(new SetCardInfo("Cyclops Electromancer", 122, Rarity.UNCOMMON, mage.cards.c.CyclopsElectromancer.class));
        cards.add(new SetCardInfo("Davriel's Shadowfugue", 84, Rarity.COMMON, mage.cards.d.DavrielsShadowfugue.class));
        cards.add(new SetCardInfo("Davriel, Rogue Shadowmage", 83, Rarity.UNCOMMON, mage.cards.d.DavrielRogueShadowmage.class));
        cards.add(new SetCardInfo("Deathsprout", 189, Rarity.UNCOMMON, mage.cards.d.Deathsprout.class));
        cards.add(new SetCardInfo("Defiant Strike", 9, Rarity.COMMON, mage.cards.d.DefiantStrike.class));
        cards.add(new SetCardInfo("Deliver Unto Evil", 85, Rarity.RARE, mage.cards.d.DeliverUntoEvil.class));
        cards.add(new SetCardInfo("Demolish", 123, Rarity.COMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Desperate Lunge", 266, Rarity.COMMON, mage.cards.d.DesperateLunge.class));
        cards.add(new SetCardInfo("Devouring Hellion", 124, Rarity.UNCOMMON, mage.cards.d.DevouringHellion.class));
        cards.add(new SetCardInfo("Domri's Ambush", 192, Rarity.UNCOMMON, mage.cards.d.DomrisAmbush.class));
        cards.add(new SetCardInfo("Domri, Anarch of Bolas", 191, Rarity.RARE, mage.cards.d.DomriAnarchOfBolas.class));
        cards.add(new SetCardInfo("Dovin's Veto", 193, Rarity.UNCOMMON, mage.cards.d.DovinsVeto.class));
        cards.add(new SetCardInfo("Dovin, Hand of Control", 229, Rarity.UNCOMMON, mage.cards.d.DovinHandOfControl.class));
        cards.add(new SetCardInfo("Dreadhorde Arcanist", 125, Rarity.RARE, mage.cards.d.DreadhordeArcanist.class));
        cards.add(new SetCardInfo("Dreadhorde Butcher", 194, Rarity.RARE, mage.cards.d.DreadhordeButcher.class));
        cards.add(new SetCardInfo("Dreadhorde Invasion", 86, Rarity.RARE, mage.cards.d.DreadhordeInvasion.class));
        cards.add(new SetCardInfo("Dreadhorde Twins", 126, Rarity.UNCOMMON, mage.cards.d.DreadhordeTwins.class));
        cards.add(new SetCardInfo("Emergence Zone", 245, Rarity.UNCOMMON, mage.cards.e.EmergenceZone.class));
        cards.add(new SetCardInfo("Enter the God-Eternals", 196, Rarity.RARE, mage.cards.e.EnterTheGodEternals.class));
        cards.add(new SetCardInfo("Erratic Visionary", 48, Rarity.COMMON, mage.cards.e.ErraticVisionary.class));
        cards.add(new SetCardInfo("Eternal Skylord", 49, Rarity.UNCOMMON, mage.cards.e.EternalSkylord.class));
        cards.add(new SetCardInfo("Eternal Taskmaster", 90, Rarity.UNCOMMON, mage.cards.e.EternalTaskmaster.class));
        cards.add(new SetCardInfo("Evolution Sage", 159, Rarity.UNCOMMON, mage.cards.e.EvolutionSage.class));
        cards.add(new SetCardInfo("Fblthp, the Lost", 50, Rarity.RARE, mage.cards.f.FblthpTheLost.class));
        cards.add(new SetCardInfo("Feather, the Redeemed", 197, Rarity.RARE, mage.cards.f.FeatherTheRedeemed.class));
        cards.add(new SetCardInfo("Firemind Vessel", 237, Rarity.UNCOMMON, mage.cards.f.FiremindVessel.class));
        cards.add(new SetCardInfo("Flux Channeler", 52, Rarity.UNCOMMON, mage.cards.f.FluxChanneler.class));
        cards.add(new SetCardInfo("Forced Landing", 161, Rarity.COMMON, mage.cards.f.ForcedLanding.class));
        cards.add(new SetCardInfo("Forest", 262, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 263, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 264, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Giant Growth", 162, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Gideon's Battle Cry", 267, Rarity.RARE, mage.cards.g.GideonsBattleCry.class));
        cards.add(new SetCardInfo("Gideon's Company", 268, Rarity.UNCOMMON, mage.cards.g.GideonsCompany.class));
        cards.add(new SetCardInfo("Gideon's Triumph", 15, Rarity.UNCOMMON, mage.cards.g.GideonsTriumph.class));
        cards.add(new SetCardInfo("Gideon, the Oathsworn", 265, Rarity.MYTHIC, mage.cards.g.GideonTheOathsworn.class));
        cards.add(new SetCardInfo("Gleaming Overseer", 198, Rarity.UNCOMMON, mage.cards.g.GleamingOverseer.class));
        cards.add(new SetCardInfo("Goblin Assailant", 128, Rarity.COMMON, mage.cards.g.GoblinAssailant.class));
        cards.add(new SetCardInfo("Goblin Assault Team", 129, Rarity.COMMON, mage.cards.g.GoblinAssaultTeam.class));
        cards.add(new SetCardInfo("God-Eternal Bontu", 92, Rarity.MYTHIC, mage.cards.g.GodEternalBontu.class));
        cards.add(new SetCardInfo("God-Eternal Rhonas", 163, Rarity.MYTHIC, mage.cards.g.GodEternalRhonas.class));
        cards.add(new SetCardInfo("God-Pharaoh's Statue", 238, Rarity.UNCOMMON, mage.cards.g.GodPharaohsStatue.class));
        cards.add(new SetCardInfo("Grateful Apparition", 17, Rarity.UNCOMMON, mage.cards.g.GratefulApparition.class));
        cards.add(new SetCardInfo("Grim Initiate", 130, Rarity.COMMON, mage.cards.g.GrimInitiate.class));
        cards.add(new SetCardInfo("Heartfire", 131, Rarity.COMMON, mage.cards.h.Heartfire.class));
        cards.add(new SetCardInfo("Herald of the Dreadhorde", 93, Rarity.COMMON, mage.cards.h.HeraldOfTheDreadhorde.class));
        cards.add(new SetCardInfo("Honor the God-Pharaoh", 132, Rarity.COMMON, mage.cards.h.HonorTheGodPharaoh.class));
        cards.add(new SetCardInfo("Ignite the Beacon", 18, Rarity.RARE, mage.cards.i.IgniteTheBeacon.class));
        cards.add(new SetCardInfo("Ilharg, the Raze-Boar", 133, Rarity.MYTHIC, mage.cards.i.IlhargTheRazeBoar.class));
        cards.add(new SetCardInfo("Interplanar Beacon", 247, Rarity.UNCOMMON, mage.cards.i.InterplanarBeacon.class));
        cards.add(new SetCardInfo("Invade the City", 201, Rarity.UNCOMMON, mage.cards.i.InvadeTheCity.class));
        cards.add(new SetCardInfo("Invading Manticore", 134, Rarity.COMMON, mage.cards.i.InvadingManticore.class));
        cards.add(new SetCardInfo("Iron Bully", 240, Rarity.COMMON, mage.cards.i.IronBully.class));
        cards.add(new SetCardInfo("Island", 253, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 254, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace's Triumph", 55, Rarity.UNCOMMON, mage.cards.j.JacesTriumph.class));
        cards.add(new SetCardInfo("Jace, Wielder of Mysteries", 54, Rarity.RARE, mage.cards.j.JaceWielderOfMysteries.class));
        cards.add(new SetCardInfo("Jaya's Greeting", 136, Rarity.COMMON, mage.cards.j.JayasGreeting.class));
        cards.add(new SetCardInfo("Jaya, Venerated Firemage", 135, Rarity.UNCOMMON, mage.cards.j.JayaVeneratedFiremage.class));
        cards.add(new SetCardInfo("Jiang Yanggu, Wildcrafter", 164, Rarity.UNCOMMON, mage.cards.j.JiangYangguWildcrafter.class));
        cards.add(new SetCardInfo("Karn's Bastion", 248, Rarity.RARE, mage.cards.k.KarnsBastion.class));
        cards.add(new SetCardInfo("Karn, the Great Creator", 1, Rarity.RARE, mage.cards.k.KarnTheGreatCreator.class));
        cards.add(new SetCardInfo("Kasmina's Transmutation", 57, Rarity.COMMON, mage.cards.k.KasminasTransmutation.class));
        cards.add(new SetCardInfo("Kasmina, Enigmatic Mentor", 56, Rarity.UNCOMMON, mage.cards.k.KasminaEnigmaticMentor.class));
        cards.add(new SetCardInfo("Kaya's Ghostform", 94, Rarity.COMMON, mage.cards.k.KayasGhostform.class));
        cards.add(new SetCardInfo("Kaya, Bane of the Dead", 231, Rarity.UNCOMMON, mage.cards.k.KayaBaneOfTheDead.class));
        cards.add(new SetCardInfo("Kiora's Dambreaker", 58, Rarity.COMMON, mage.cards.k.KiorasDambreaker.class));
        cards.add(new SetCardInfo("Kiora, Behemoth Beckoner", 232, Rarity.UNCOMMON, mage.cards.k.KioraBehemothBeckoner.class));
        cards.add(new SetCardInfo("Krenko, Tin Street Kingpin", 137, Rarity.RARE, mage.cards.k.KrenkoTinStreetKingpin.class));
        cards.add(new SetCardInfo("Kronch Wrangler", 166, Rarity.COMMON, mage.cards.k.KronchWrangler.class));
        cards.add(new SetCardInfo("Law-Rune Enforcer", 20, Rarity.COMMON, mage.cards.l.LawRuneEnforcer.class));
        cards.add(new SetCardInfo("Lazotep Behemoth", 95, Rarity.COMMON, mage.cards.l.LazotepBehemoth.class));
        cards.add(new SetCardInfo("Lazotep Plating", 59, Rarity.UNCOMMON, mage.cards.l.LazotepPlating.class));
        cards.add(new SetCardInfo("Lazotep Reaver", 96, Rarity.COMMON, mage.cards.l.LazotepReaver.class));
        cards.add(new SetCardInfo("Leyline Prowler", 202, Rarity.UNCOMMON, mage.cards.l.LeylineProwler.class));
        cards.add(new SetCardInfo("Liliana's Triumph", 98, Rarity.UNCOMMON, mage.cards.l.LilianasTriumph.class));
        cards.add(new SetCardInfo("Liliana, Dreadhorde General", 97, Rarity.MYTHIC, mage.cards.l.LilianaDreadhordeGeneral.class));
        cards.add(new SetCardInfo("Living Twister", 203, Rarity.RARE, mage.cards.l.LivingTwister.class));
        cards.add(new SetCardInfo("Loxodon Sergeant", 21, Rarity.COMMON, mage.cards.l.LoxodonSergeant.class));
        cards.add(new SetCardInfo("Makeshift Battalion", 22, Rarity.COMMON, mage.cards.m.MakeshiftBattalion.class));
        cards.add(new SetCardInfo("Martyr for the Cause", 23, Rarity.COMMON, mage.cards.m.MartyrForTheCause.class));
        cards.add(new SetCardInfo("Massacre Girl", 99, Rarity.RARE, mage.cards.m.MassacreGirl.class));
        cards.add(new SetCardInfo("Mayhem Devil", 204, Rarity.UNCOMMON, mage.cards.m.MayhemDevil.class));
        cards.add(new SetCardInfo("Merfolk Skydiver", 205, Rarity.UNCOMMON, mage.cards.m.MerfolkSkydiver.class));
        cards.add(new SetCardInfo("Mizzium Tank", 138, Rarity.RARE, mage.cards.m.MizziumTank.class));
        cards.add(new SetCardInfo("Mountain", 259, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 260, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 261, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mowu, Loyal Companion", 167, Rarity.UNCOMMON, mage.cards.m.MowuLoyalCompanion.class));
        cards.add(new SetCardInfo("Naga Eternal", 60, Rarity.COMMON, mage.cards.n.NagaEternal.class));
        cards.add(new SetCardInfo("Nahiri's Stoneblades", 139, Rarity.COMMON, mage.cards.n.NahirisStoneblades.class));
        cards.add(new SetCardInfo("Nahiri, Storm of Stone", 233, Rarity.UNCOMMON, mage.cards.n.NahiriStormOfStone.class));
        cards.add(new SetCardInfo("Neheb, Dreadhorde Champion", 140, Rarity.RARE, mage.cards.n.NehebDreadhordeChampion.class));
        cards.add(new SetCardInfo("Neoform", 206, Rarity.UNCOMMON, mage.cards.n.Neoform.class));
        cards.add(new SetCardInfo("Nicol Bolas, Dragon-God", 207, Rarity.MYTHIC, mage.cards.n.NicolBolasDragonGod.class));
        cards.add(new SetCardInfo("Nissa's Triumph", 170, Rarity.UNCOMMON, mage.cards.n.NissasTriumph.class));
        cards.add(new SetCardInfo("Nissa, Who Shakes the World", 169, Rarity.RARE, mage.cards.n.NissaWhoShakesTheWorld.class));
        cards.add(new SetCardInfo("Niv-Mizzet Reborn", 208, Rarity.MYTHIC, mage.cards.n.NivMizzetReborn.class));
        cards.add(new SetCardInfo("No Escape", 63, Rarity.COMMON, mage.cards.n.NoEscape.class));
        cards.add(new SetCardInfo("Ob Nixilis's Cruelty", 101, Rarity.COMMON, mage.cards.o.ObNixilissCruelty.class));
        cards.add(new SetCardInfo("Ob Nixilis, the Hate-Twisted", 100, Rarity.UNCOMMON, mage.cards.o.ObNixilisTheHateTwisted.class));
        cards.add(new SetCardInfo("Orzhov Guildgate", 269, Rarity.COMMON, mage.cards.o.OrzhovGuildgate.class));
        cards.add(new SetCardInfo("Paradise Druid", 171, Rarity.UNCOMMON, mage.cards.p.ParadiseDruid.class));
        cards.add(new SetCardInfo("Parhelion II", 24, Rarity.RARE, mage.cards.p.ParhelionII.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pledge of Unity", 210, Rarity.UNCOMMON, mage.cards.p.PledgeOfUnity.class));
        cards.add(new SetCardInfo("Pollenbright Druid", 173, Rarity.COMMON, mage.cards.p.PollenbrightDruid.class));
        cards.add(new SetCardInfo("Pouncing Lynx", 25, Rarity.COMMON, mage.cards.p.PouncingLynx.class));
        cards.add(new SetCardInfo("Primordial Wurm", 174, Rarity.COMMON, mage.cards.p.PrimordialWurm.class));
        cards.add(new SetCardInfo("Raging Kronch", 141, Rarity.COMMON, mage.cards.r.RagingKronch.class));
        cards.add(new SetCardInfo("Ral's Outburst", 212, Rarity.UNCOMMON, mage.cards.r.RalsOutburst.class));
        cards.add(new SetCardInfo("Ral, Storm Conduit", 211, Rarity.RARE, mage.cards.r.RalStormConduit.class));
        cards.add(new SetCardInfo("Rally of Wings", 27, Rarity.UNCOMMON, mage.cards.r.RallyOfWings.class));
        cards.add(new SetCardInfo("Ravnica at War", 28, Rarity.RARE, mage.cards.r.RavnicaAtWar.class));
        cards.add(new SetCardInfo("Relentless Advance", 64, Rarity.COMMON, mage.cards.r.RelentlessAdvance.class));
        cards.add(new SetCardInfo("Rescuer Sphinx", 65, Rarity.UNCOMMON, mage.cards.r.RescuerSphinx.class));
        cards.add(new SetCardInfo("Rising Populace", 29, Rarity.COMMON, mage.cards.r.RisingPopulace.class));
        cards.add(new SetCardInfo("Roalesk, Apex Hybrid", 213, Rarity.MYTHIC, mage.cards.r.RoaleskApexHybrid.class));
        cards.add(new SetCardInfo("Role Reversal", 214, Rarity.RARE, mage.cards.r.RoleReversal.class));
        cards.add(new SetCardInfo("Saheeli's Silverwing", 243, Rarity.COMMON, mage.cards.s.SaheelisSilverwing.class));
        cards.add(new SetCardInfo("Saheeli, Sublime Artificer", 234, Rarity.UNCOMMON, mage.cards.s.SaheeliSublimeArtificer.class));
        cards.add(new SetCardInfo("Samut's Sprint", 142, Rarity.COMMON, mage.cards.s.SamutsSprint.class));
        cards.add(new SetCardInfo("Samut, Tyrant Smasher", 235, Rarity.UNCOMMON, mage.cards.s.SamutTyrantSmasher.class));
        cards.add(new SetCardInfo("Shriekdiver", 103, Rarity.COMMON, mage.cards.s.Shriekdiver.class));
        cards.add(new SetCardInfo("Silent Submersible", 66, Rarity.RARE, mage.cards.s.SilentSubmersible.class));
        cards.add(new SetCardInfo("Single Combat", 30, Rarity.RARE, mage.cards.s.SingleCombat.class));
        cards.add(new SetCardInfo("Solar Blaze", 216, Rarity.RARE, mage.cards.s.SolarBlaze.class));
        cards.add(new SetCardInfo("Sorin's Thirst", 104, Rarity.COMMON, mage.cards.s.SorinsThirst.class));
        cards.add(new SetCardInfo("Sorin, Vengeful Bloodlord", 217, Rarity.RARE, mage.cards.s.SorinVengefulBloodlord.class));
        cards.add(new SetCardInfo("Spark Harvest", 105, Rarity.COMMON, mage.cards.s.SparkHarvest.class));
        cards.add(new SetCardInfo("Spellgorger Weird", 145, Rarity.COMMON, mage.cards.s.SpellgorgerWeird.class));
        cards.add(new SetCardInfo("Spellkeeper Weird", 69, Rarity.COMMON, mage.cards.s.SpellkeeperWeird.class));
        cards.add(new SetCardInfo("Steady Aim", 177, Rarity.COMMON, mage.cards.s.SteadyAim.class));
        cards.add(new SetCardInfo("Stealth Mission", 70, Rarity.COMMON, mage.cards.s.StealthMission.class));
        cards.add(new SetCardInfo("Storrev, Devkarin Lich", 219, Rarity.RARE, mage.cards.s.StorrevDevkarinLich.class));
        cards.add(new SetCardInfo("Sunblade Angel", 31, Rarity.UNCOMMON, mage.cards.s.SunbladeAngel.class));
        cards.add(new SetCardInfo("Swamp", 256, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 257, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 258, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tamiyo's Epiphany", 71, Rarity.COMMON, mage.cards.t.TamiyosEpiphany.class));
        cards.add(new SetCardInfo("Tamiyo, Collector of Tales", 220, Rarity.RARE, mage.cards.t.TamiyoCollectorOfTales.class));
        cards.add(new SetCardInfo("Teferi's Time Twist", 72, Rarity.COMMON, mage.cards.t.TeferisTimeTwist.class));
        cards.add(new SetCardInfo("Teferi, Time Raveler", 221, Rarity.RARE, mage.cards.t.TeferiTimeRaveler.class));
        cards.add(new SetCardInfo("Tenth District Legionnaire", 222, Rarity.UNCOMMON, mage.cards.t.TenthDistrictLegionnaire.class));
        cards.add(new SetCardInfo("Teyo's Lightshield", 33, Rarity.COMMON, mage.cards.t.TeyosLightshield.class));
        cards.add(new SetCardInfo("Teyo, the Shieldmage", 32, Rarity.UNCOMMON, mage.cards.t.TeyoTheShieldmage.class));
        cards.add(new SetCardInfo("Tezzeret, Master of the Bridge", 275, Rarity.MYTHIC, mage.cards.t.TezzeretMasterOfTheBridge.class));
        cards.add(new SetCardInfo("The Elderspell", 89, Rarity.RARE, mage.cards.t.TheElderspell.class));
        cards.add(new SetCardInfo("The Wanderer", 37, Rarity.UNCOMMON, mage.cards.t.TheWanderer.class));
        cards.add(new SetCardInfo("Thundering Ceratok", 179, Rarity.COMMON, mage.cards.t.ThunderingCeratok.class));
        cards.add(new SetCardInfo("Tibalt's Rager", 147, Rarity.UNCOMMON, mage.cards.t.TibaltsRager.class));
        cards.add(new SetCardInfo("Tibalt, Rakish Instigator", 146, Rarity.UNCOMMON, mage.cards.t.TibaltRakishInstigator.class));
        cards.add(new SetCardInfo("Time Wipe", 223, Rarity.RARE, mage.cards.t.TimeWipe.class));
        cards.add(new SetCardInfo("Toll of the Invasion", 108, Rarity.COMMON, mage.cards.t.TollOfTheInvasion.class));
        cards.add(new SetCardInfo("Tolsimir, Friend to Wolves", 224, Rarity.RARE, mage.cards.t.TolsimirFriendToWolves.class));
        cards.add(new SetCardInfo("Tomik, Distinguished Advokist", 34, Rarity.RARE, mage.cards.t.TomikDistinguishedAdvokist.class));
        cards.add(new SetCardInfo("Topple the Statue", 35, Rarity.COMMON, mage.cards.t.ToppleTheStatue.class));
        cards.add(new SetCardInfo("Totally Lost", 74, Rarity.COMMON, mage.cards.t.TotallyLost.class));
        cards.add(new SetCardInfo("Turret Ogre", 148, Rarity.COMMON, mage.cards.t.TurretOgre.class));
        cards.add(new SetCardInfo("Vivien's Arkbow", 181, Rarity.RARE, mage.cards.v.ViviensArkbow.class));
        cards.add(new SetCardInfo("Vivien's Grizzly", 182, Rarity.COMMON, mage.cards.v.ViviensGrizzly.class));
        cards.add(new SetCardInfo("Vivien, Champion of the Wilds", 180, Rarity.RARE, mage.cards.v.VivienChampionOfTheWilds.class));
        cards.add(new SetCardInfo("Vizier of the Scorpion", 111, Rarity.UNCOMMON, mage.cards.v.VizierOfTheScorpion.class));
        cards.add(new SetCardInfo("Vraska's Finisher", 112, Rarity.COMMON, mage.cards.v.VraskasFinisher.class));
        cards.add(new SetCardInfo("Vraska, Swarm's Eminence", 236, Rarity.UNCOMMON, mage.cards.v.VraskaSwarmsEminence.class));
        cards.add(new SetCardInfo("Wanderer's Strike", 38, Rarity.COMMON, mage.cards.w.WanderersStrike.class));
        cards.add(new SetCardInfo("War Screecher", 39, Rarity.COMMON, mage.cards.w.WarScreecher.class));
        cards.add(new SetCardInfo("Wardscale Crocodile", 183, Rarity.COMMON, mage.cards.w.WardscaleCrocodile.class));
        cards.add(new SetCardInfo("Widespread Brutality", 226, Rarity.RARE, mage.cards.w.WidespreadBrutality.class));
    }
}
